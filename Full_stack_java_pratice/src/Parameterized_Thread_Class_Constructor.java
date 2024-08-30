class MyRunnable implements Runnable{
    @Override
    public void run() {
        for (int i = 1 ; i<=10;i++){
            System.out.println("child thread");
        }
    }
}
public class Parameterized_Thread_Class_Constructor {
    public static void main(String[] args) {
        MyRunnable r = new MyRunnable();
        Thread t = new Thread(r);
        t.start();
        for (int j = 1;j<=10;j++){
            System.out.println("main thread");
        }

    }
}
