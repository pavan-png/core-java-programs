// Child Thread Class
class MyThread_9 extends Thread {

    @Override
    public void run() {

        // Loop to show multiple executions
        for (int i = 1; i <= 5; i++) {

            System.out.println(
                    "Child Thread -> Iteration: " + i +
                            " | Priority: " + Thread.currentThread().getPriority()
            );

            // yield() gives a hint to the scheduler:
            // "If any same-priority thread is waiting,
            // you can give them a chance."
            Thread.yield();
        }
    }
}

public class Yield_Method {

    public static void main(String[] args) {

        // Creating child thread object (NEW state)
        MyThread_9 t = new MyThread_9();

        // Setting child thread priority same as main thread
        // (Default priority is 5 for both)
        t.setPriority(Thread.NORM_PRIORITY);

        // Starting child thread (Runnable state)
        t.start();

        // Main thread loop
        for (int i = 1; i <= 5; i++) {

            System.out.println(
                    "Main Thread  -> Iteration: " + i +
                            " | Priority: " + Thread.currentThread().getPriority()
            );

            // Main thread also calling yield()
            // Now both threads are giving chance to each other
            Thread.yield();
        }

        /*
         Important Observations:

         1. Both threads have SAME priority (5).
         2. When one thread calls yield(),
            it moves from Running → Runnable.
         3. Scheduler may allow other thread to run.
         4. But execution order is NOT guaranteed.
         5. Sometimes one thread may execute completely first.
         6. Sometimes they may execute alternately.
         7. It depends entirely on the Thread Scheduler.
        */
    }
}