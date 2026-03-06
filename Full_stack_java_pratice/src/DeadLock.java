class MyThread_6 extends Thread {

    static Thread mainThread;

    @Override
    public void run() {

        try {
            mainThread.join();  // Child waiting for main
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class DeadLock {

    public static void main(String[] args) throws InterruptedException {

        MyThread_6.mainThread = Thread.currentThread();
        MyThread_6 t = new MyThread_6();
        t.start();

        t.join();   // Main waiting for child

        // Deadlock:
        // Main waits for child
        // Child waits for main
    }
}
