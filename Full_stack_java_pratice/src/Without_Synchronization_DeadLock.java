class A6{
    public void d1(B4 b ){
        System.out.println("thread 1 starts the execution of d()");
    try {
        Thread.sleep(4000);
    }
    catch (InterruptedException e){
        System.out.println(" interrupted exception");
    }
        System.out.println("thread 1 is trying to call b last() ");
    b.last();

    }
    public void last(){
        System.out.println("Inside A last method");
    }
}

class B4{
    public void d2(A6 a ) {
        System.out.println("thread 2 starts the execution of d2()");
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            System.out.println(" interrupted exception");
        }
        System.out.println("thread 2 is trying to call a last() ");
        a.last();
    }
    public void last(){
        System.out.println("Inside B last method");
    }
}
public class Without_Synchronization_DeadLock extends Thread{
    A6 a = new A6();
    B4 b = new B4();

    public void m1(){
        this.start(); /* two threads will be created main(5) , child (5)
        since the methods are not synchronized when d1 is executing  no lock is applied on object a ,
        and when method d1 goes sleep for 4sec , child thread will be given a chance to execute method d2.
        child thread executes first line and goes to sleep for 4 sec, again main thread will get a chance to continue execution
        and when d1 calls b.last() , since last() method of b4 class is also not synchronized no lock is applied on object b
        execution will be done . after that child thread executes a.last ,  since last() method of A6 class is also not synchronized no lock is applied on object a
        execution will be done.
        */
        a.d1(b);
    }
    public void run(){
        b.d2(a);
    }

    public static void main(String[] args) {
        Without_Synchronization_DeadLock t = new Without_Synchronization_DeadLock();
        t.m1();
    }
}
