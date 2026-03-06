// ===============================
// Case 1: Extending Thread class
// ===============================
class MyThread_1 extends Thread {

    // Case 4: Overriding run() (recommended)
    @Override
    public void run() {
        System.out.println("Child Thread executing...");
    }

    // Case 5: Overloading run() (not used by start())
    public void run(int x) {
        System.out.println("Overloaded run method: " + x);
    }

    // Case 6 & 7: Overriding start()
    @Override
    public void start() {
        System.out.println("User defined start() method");

        // Case 7: Calling parent start() to create real thread
        super.start();
    }
}


// ======================================
// Case: Not overriding run() method
// ======================================
class NoRunThread extends Thread {
    // No run() method overridden
}


// ======================================
// Case: Runnable Implementation
// ======================================
class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("Runnable Thread executing...");
    }
}


// ======================================
// Main Class
// ======================================
public class Thread_Complete_Demo {

    public static void main(String[] args) {

        System.out.println("Main thread started");

        // ======================================
        // Case 8: Life Cycle Demonstration
        // ======================================

        MyThread_1 t1 = new MyThread_1();   // NEW state
        t1.start();                     // RUNNABLE state

        // ======================================
        // Case 2: Difference between start() and run()
        // ======================================

        MyThread_1 t2 = new MyThread_1();

        t2.run();   // No new thread created (normal method call)

        // ======================================
        // Case 4: Not overriding run()
        // ======================================

        NoRunThread t3 = new NoRunThread();
        t3.start();   // No output (empty run())

        // ======================================
        // Case 5: Overloaded run() method
        // ======================================

        MyThread_1 t4 = new MyThread_1();
        t4.run(10);   // Normal method call, not a new thread

        // ======================================
        // Case 9: Starting thread twice
        // ======================================

        MyThread_1 t5 = new MyThread_1();
        t5.start();

        try {
            t5.start();   // IllegalThreadStateException
        } catch (IllegalThreadStateException e) {
            System.out.println("Cannot start thread twice");
        }

        // ======================================
        // Runnable Interface Example
        // ======================================

        MyRunnable r = new MyRunnable();
        Thread t6 = new Thread(r);
        t6.start();

        System.out.println("Main thread finished");
    }
}