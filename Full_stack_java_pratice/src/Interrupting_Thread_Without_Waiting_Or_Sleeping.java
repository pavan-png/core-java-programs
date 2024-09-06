class Mythread_13 extends Thread{
    @Override
    public void run() {

            for (int i = 1; i<=5;i++){
                System.out.println("i am lazy thread ");
            }

    }
}
public class Interrupting_Thread_Without_Waiting_Or_Sleeping {
    public static void main(String[] args) {
        Mythread_13 t = new Mythread_13();
        t.start();
        t.interrupt();
        System.out.println("end of main");

    }
}
