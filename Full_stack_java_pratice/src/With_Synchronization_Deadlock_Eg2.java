class A8{
    public synchronized void d1(B6 b ){
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
    public synchronized void last(){
        System.out.println("Inside A last method");
    }
}
class B6{
    public synchronized void d2(A8 a ) {
        System.out.println("thread 2 starts the execution of d2()");
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            System.out.println(" interrupted exception");
        }
        System.out.println("thread 2 is trying to call a last() ");
        a.last();
    }
    public synchronized void last(){
        System.out.println("Inside B last method");
    }
}
public class With_Synchronization_Deadlock_Eg2 extends Thread {
    A8 a = new A8();
    B6 b = new B6();

    public void m1(){
        this.start(); /* two threads will be created main(5) , child (5)
        since the methods are  synchronized when d1 is executing   lock is applied on object a ,
        and when method d1 goes sleep for 4sec , child thread will be given a chance to execute method d2.
        child thread  locks object b. and
        child thread executes first line and goes to sleep for 4 sec, again main thread will get a chance to continue execution
        and when d1 calls b.last() , since last() method of b6 class is  synchronized  lock is needed for main thread to execute last() method of b.
        but b lock is with method d2. so main thread will be in waiting state for b lock to execute last method
        after that child thread executes a.last ,  since last() method of A8 class is  synchronized lock is with method d1 ,so
        child thread will be waiting for a lock  , which leads to dead lock.
        */
        a.d1(b);
    }
    public void run(){
        b.d2(a);
    }

    public static void main(String[] args) {
        With_Synchronization_Deadlock_Eg2 t = new With_Synchronization_Deadlock_Eg2();
        t.m1();
    }
}
