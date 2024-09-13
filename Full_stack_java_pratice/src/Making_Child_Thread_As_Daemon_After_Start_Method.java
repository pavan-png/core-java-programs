class Mythread_31 extends Thread{
    @Override
    public void run() {
        for (int i = 1;i<=5;i++){
            System.out.println("is thread a daemon thread: "+this.isDaemon() +" priority is "+this.getPriority() );
        }
        try{
            Thread.sleep(2000);
        }
        catch (InterruptedException e){
            System.out.println(e);
        }
    }
}

public class Making_Child_Thread_As_Daemon_After_Start_Method{
    public static void main(String[] args) {
        Mythread_31 t = new Mythread_31();

        t.start();
        t.setDaemon(true);
        // leads to IllegalThreadStateException once the thread is created we cant make it to daemon thread
        try {
            Thread.sleep(4000);
            /*
            since main thread goes to waiting state for 4 sec , in the mean time deamon thread will continue its execution
             */
        }
        catch (InterruptedException e){
            System.out.println("interrupted exception main thread");
        }
        System.out.println("end of main thread");

    }
}
