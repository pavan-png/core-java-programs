class TestThread extends Thread {

    public void run() {
        System.out.println("Thread running...");
    }
}

public class DaemonExceptionExample {

    public static void main(String[] args) {

        TestThread t = new TestThread();

        t.start();

        // Trying to set daemon AFTER start
        t.setDaemon(true);  // ❌ Exception occurs

        /*
        Output:

        Exception in thread "main"
        java.lang.IllegalThreadStateException

        Reason:

        setDaemon(true) must be called
        BEFORE starting the thread.
        */
    }
}