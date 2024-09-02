class Mythread_9 extends Thread{
    @Override
    public void run() {
        for (int i = 1 ; i<=5; i++){
            System.out.println("child thread");
            Thread.yield();
        }
    }
}
public class Yeild_Method {
    public static void main(String[] args) {
        Mythread_9 t = new Mythread_9();
        t.start();
        for (int i = 1 ; i<=5 ; i++){
            System.out.println("main thread");
        }
    }
}
