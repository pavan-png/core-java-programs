// ===============================
// Runnable Implementation
// ===============================
class MyRunnable_1 implements Runnable {

    @Override
    public void run() {
        System.out.println(
                "Runnable executed by: " + Thread.currentThread().getName()
        );
    }
}

// ===============================
// Thread Extension
// ===============================
class MyThread_2 extends Thread {

    // For Case 1 (Thread())
    public MyThread_2() {
        super();
    }

    // For Case 3 (Thread(String name))
    public MyThread_2(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(
                "Thread executed by: " + Thread.currentThread().getName()
        );
    }
}

// ===============================
// Main Class
// ===============================
public class Thread_Constructor_Demo {

    public static void main(String[] args) {

        System.out.println("Main started: " + Thread.currentThread().getName());

        // =====================================
        // Case 1: Thread()
        // Constructor: public Thread()
        // No Runnable, Default name
        // =====================================
        Thread t1 = new MyThread_2();
        t1.start();


        // =====================================
        // Case 2: Thread(Runnable target)
        // Constructor: public Thread(Runnable target)
        // Runnable attached, Default name
        // =====================================
        Runnable r = new MyRunnable_1();
        Thread t2 = new Thread(r);
        t2.start();


        // =====================================
        // Case 3: Thread(String name)
        // Constructor: public Thread(String name)
        // Custom name, No Runnable
        // =====================================
        Thread t3 = new MyThread_2("Custom-Thread-1");
        t3.start();


        // =====================================
        // Case 4: Thread(Runnable target, String name)
        // Constructor: public Thread(Runnable target, String name)
        // Runnable attached + Custom name
        // =====================================
        Thread t4 = new Thread(new MyRunnable_1(), "Payment-Thread");
        t4.start();


        System.out.println("Main ended: " + Thread.currentThread().getName());
    }
}