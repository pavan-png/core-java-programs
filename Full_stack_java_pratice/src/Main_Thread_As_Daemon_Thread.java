class Mythread_32 extends Thread{
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

public class Main_Thread_As_Daemon_Thread{
    public static void main(String[] args) {

        Thread.currentThread().setDaemon(true);
        // results in IllegalThreadStateException , since once thread started , its type cannot be changed

        Mythread_32 t = new Mythread_32();

        t.setDaemon(true);
        t.start();

        try {
            Thread.sleep(4000);

        }
        catch (InterruptedException e){
            System.out.println("interrupted exception main thread");
        }
        System.out.println("end of main thread");

    }
}
