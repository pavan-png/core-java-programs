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
class Mythread extends Thread{
    @Override
    // task for user defined thread
    public void run() {
        super.run();
        for ( int i = 1 ; i <=10 ; i++){
            System.out.println("child thread");
        }
    }
}
public class Thread_Eg1 {
    public static void main(String[] args) {
        Mythread obj = new Mythread();

        // this line will create a new thread which is responsible to execute run()
        obj.start();
        // two threads started and waiting for cpu time , scheduling is done by thread scheduler

        // task for main thread
        for ( int i = 1 ; i <=10 ; i++){
            System.out.println("Main thread");
        }
    }
}
