class Mythread_14 extends Thread{
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("iam a lazy thread");
        }
        System.out.println("entering into sleeping state");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println("i got interrupted");
        }
    }
}
public class Interrupting_Thread_Waiting_After_Execution {
    public static void main(String[] args) {
        Mythread_14 t = new Mythread_14();
        t.start();
        t.interrupt();
        System.out.println("end of main");
    }
}
