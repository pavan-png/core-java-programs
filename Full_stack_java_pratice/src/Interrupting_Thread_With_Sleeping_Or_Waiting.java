class Mythread_12 extends Thread{
    @Override
    public void run() {
        try{
            for (int i = 1; i<=5;i++){
                System.out.println("i am lazy thread ");
                Thread.sleep(2000);
            }
        }
        catch (InterruptedException e){
            System.out.println("i got interrupted");
        }
    }
}
public class Interrupting_Thread_With_Sleeping_Or_Waiting{
    public static void main(String[] args) {
        Mythread_12 t = new Mythread_12();
        t.start();
        t.interrupt();
        System.out.println("end of main");

    }
}
