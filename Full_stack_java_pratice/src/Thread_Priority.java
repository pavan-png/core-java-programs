class Mythread_8 extends Thread{
    @Override
    public void run() {
        for (int i =0 ; i<=5; i++){
            System.out.println("child thread");
        }
    }
}
public class Thread_Priority {
    public static void main(String[] args) {
        Mythread_8 t = new Mythread_8();
        t.setPriority(7);
        t.start();
        for (int i =1; i<=5;i++){
            System.out.println("main thread");
        }

    }
}
