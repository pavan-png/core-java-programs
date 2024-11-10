class Counter_1 implements Runnable{
    public static int i = 3;
    @Override
    public void run() {
        System.out.println(i--);
    }
}
public class Thread_Eg2 {
    public static void main(String[] args) {
        Counter_1 c = new Counter_1();
        Thread t1 = new Thread(c);
        Thread t2 = new Thread(new Counter_1());
        Thread t3 = new Thread(new Counter_1());
        Thread[] arr = {t1,t2,t3};
        for (Thread ts : arr){
            ts.start();
        }

    }
}
