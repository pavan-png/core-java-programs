class A7{
    public synchronized void d1(B5 b ){
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

class B5{
    public synchronized void d2(A7 a ) {
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
public class With_Synchronization_Deadlock extends Thread{
    A6 a = new A6();
    B4 b = new B4();

    public void m1(){
        this.start(); /* two threads will be created main(5) , child (5)
        since the methods are  synchronized when d1 is executing   lock is applied on object a ,
        and when method d1 goes sleep for 4sec , child thread will be given a chance to execute method d2.
        child thread  locks object b. and
        child thread executes first line and goes to sleep for 4 sec, again main thread will get a chance to continue execution
        and when d1 calls b.last() , since last() method of b5 class is  not synchronized no need of lock to execute b5 last method
        execution will be normal. after that child thread executes a.last ,  since last() method of A7 class is  not synchronized no need of lock to execute
        A7 last() method.
        */
        a.d1(b);
    }
    public void run(){
        b.d2(a);
    }

    public static void main(String[] args) {
        With_Synchronization_Deadlock t = new With_Synchronization_Deadlock();
        t.m1();
    }
}
