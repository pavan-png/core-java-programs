// Custom thread class
class MyThread_7 extends Thread {

    @Override
    public void run() {

        // 5. JVM calls run() method in the NEW thread.
        //    Now this code is executing in MyThread, not main thread.

        try {

            // 6. Thread prints message using its own stack.
            System.out.println("Thread going to sleep");

            // 7. Thread calls sleep(5000).
            //    Internally:
            //    - Thread state changes from RUNNABLE → TIMED_WAITING.
            //    - Thread scheduler removes it from CPU.
            //    - It will sleep for 5 seconds unless interrupted.
            Thread.sleep(5000);

            // 11. If 5 seconds complete normally (no interrupt),
            //     thread wakes up and continues execution.
            System.out.println("Thread woke up normally");

        } catch (InterruptedException e) {

            // 10. If interrupt() is called while thread is sleeping:
            //     - JVM sets interrupt flag.
            //     - Since thread is in sleep(), JVM clears the flag.
            //     - JVM throws InterruptedException.
            //     - Control jumps directly to this catch block.
            System.out.println("Thread interrupted while sleeping");
        }

        // 12. After try-catch completes,
        //     run() method ends and thread becomes TERMINATED.
    }
}


// Main class
public class Interrupting_Thread_With_Sleep {

    public static void main(String[] args) {

        // 1. Main thread starts execution.

        // 2. MyThread object is created.
        //    Only object is created, NO new thread yet.
        MyThread_7 t = new MyThread_7();

        // 3. start() is called.
        //    Internally:
        //    - JVM creates a new thread.
        //    - Allocates separate call stack.
        //    - Moves thread to RUNNABLE state.
        //    - Scheduler will call run() method.
        t.start();

        try {

            // 4. Main thread sleeps for 2 seconds.
            //    Main thread state → TIMED_WAITING.
            //    During this time, MyThread executes run().
            Thread.sleep(2000);

        } catch (InterruptedException e) {
        }

        // 8. After 2 seconds, main thread wakes up.

        // 9. Main thread calls interrupt() on MyThread.
        //    Internally:
        //    - JVM checks MyThread state.
        //    - Since it is sleeping, it wakes it immediately.
        //    - sleep() throws InterruptedException.
        t.interrupt();

        // 13. Main thread finishes execution.
        //     Main thread becomes TERMINATED.
    }
}