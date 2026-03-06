class MyThread_8 extends Thread {

    @Override
    public void run() {

        // 4. JVM calls run() method in the new thread.

        for (int i = 1; i <= 5; i++) {

            // 5. Before doing work, thread checks interrupt flag.
            if (Thread.currentThread().isInterrupted()) {

                // 6. If interrupt flag is TRUE,
                //    thread decides to stop itself.
                //
                // IMPORTANT:
                // interrupt() does NOT force stop the thread.
                // JVM only sets interrupt flag.
                //
                // Stopping does NOT depend on OS.
                // It depends on THIS thread’s code logic.
                //
                // Thread must cooperatively check interrupt status
                // and decide to terminate.
                System.out.println("Thread detected interrupt. Stopping...");
                return;   // Thread stops voluntarily
            }

            // 7. If no interrupt, thread continues execution.
            System.out.println("Running: " + i);
        }

        // 8. If loop completes normally,
        //    thread execution ends.
    }
}

public class Interrupting_Thread_Without_Sleep {

    public static void main(String[] args) {

        // 1. Main thread starts.

        MyThread_8 t = new MyThread_8();  // 2. Object created

        t.start();  // 3. New thread created and run() starts

        // 9. Main thread calls interrupt()
        t.interrupt();

        // 10. interrupt() does:
        //     - Sets interrupt flag = TRUE
        //     - Does NOT kill thread
        //     - Does NOT depend on OS to stop it
        //     - Thread must check flag and stop itself
    }
}