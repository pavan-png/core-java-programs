class MyThread_6 extends Thread{
    @Override
    public void run() {
        for (int i = 1 ; i<=10 ; i++){
            System.out.println("child thread");
        }
    }
}
public class Alternative_Approach_For_Thread_Creation {
    public static void main(String[] args) {
        MyThread_6 t = new MyThread_6();
        Thread t2 = new Thread(t);
        t2.start();
        for (int i = 1 ; i<=10 ; i++){
            System.out.println("main thread");
        }
    }
}
