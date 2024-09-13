class Mythread_30 extends Thread{
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

public class Daemon_Thread{
    public static void main(String[] args) {
        Mythread_30 t = new Mythread_30();
        t.setDaemon(true);
        t.start();
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
