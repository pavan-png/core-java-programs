class Mythread_11 extends Thread{
    static Thread mt;
    @Override
    public void run() {
        try {
            mt.join();
        }
        catch (InterruptedException e){
        }
        for (int i = 0 ; i<5; i++){
            System.out.println("child thread");

        }
    }
}
public class Child_Thread_Waiting_For_Main_Thread {
    public static void main(String[] args) throws InterruptedException {
        Mythread_11.mt = Thread.currentThread();
        Mythread_11 t = new Mythread_11();
        t.start();
        for (int i = 0 ; i<5; i++){
            System.out.println("main thread");
            Thread.sleep(2000);
        }
    }
}
