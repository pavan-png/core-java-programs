/*
class Thread {
        public void start(){
            1. register the thread with thread scheduler
            2. all other mandatory low level activites
            3. invoke (or) call run() method.
        }
        public void  ru() {
        no implementation
        }

 */
class Thread_Eg1 extends Thread{
    @Override
    // task for user defined thread
    public void run() {
        super.run();
        for ( int i = 1 ; i <=10 ; i++){
            System.out.println("child thread");
        }
    }
}
public class MyThread_Eg1 {
    public static void main(String[] args) {
        Thread_Eg1 obj = new Thread_Eg1();

        // this line will create a new thread which is responsible to execute run()
        obj.start();
        // two threads started and waiting for cpu time , scheduling is done by thread scheduler

        // task for main thread
        for ( int i = 1 ; i <=10 ; i++){
            System.out.println("Main thread");
        }
    }
}
