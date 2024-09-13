class Mythread_29 extends Thread{
    @Override
    public void run() {
        for (int i = 1;i<=5;i++){
            System.out.println("child thread  nature : "+this.isDaemon()  );
        }
        try{
            Thread.sleep(2000);
        }
        catch (InterruptedException e){
            System.out.println(e);
        }
    }
}

public class Daemon_Thread_Dead_State{
    public static void main(String[] args) {
        Mythread_29 t = new Mythread_29();
        t.setDaemon(true);
        t.start();
        System.out.println("end of main thread");
        /*
        child thread i.e daemon thread will be alive only until the main thread is executing. if the main thread is in dead
        state , then daemon thread will also  enter into dead state, since daemon thread is the supporting thread of the main thread.
         */
    }
}
