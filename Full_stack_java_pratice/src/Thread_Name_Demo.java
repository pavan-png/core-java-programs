class MyRunnable_2 implements Runnable {

    @Override
    public void run() {
        System.out.println("Running in: " + Thread.currentThread().getName());
    }
}

public class Thread_Name_Demo {

    public static void main(String[] args) {

        Runnable r1 = new MyRunnable_2();
        Runnable r2 = new MyRunnable_2();

        // =========================================
        // Approach 1: Using Constructor (PREFERRED)
        // Name is assigned at creation time
        // Cleaner and recommended in industry
        // =========================================
        Thread t1 = new Thread(r1, "Payment-Worker");
        t1.start();


        // =========================================
        // Approach 2: Using setName() (Also Valid)
        // Name assigned after creation
        // Works fine, but slightly less clean
        // =========================================
        Thread t2 = new Thread(r2);
        t2.setName("Order-Worker");
        t2.start();
    }
}