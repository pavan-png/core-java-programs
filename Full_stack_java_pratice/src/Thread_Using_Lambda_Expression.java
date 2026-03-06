public class Thread_Using_Lambda_Expression {

    public static void main(String[] args) {

        // 1. Main thread starts execution.
        //    Every Java program starts with one thread called "main".

        // 2. Lambda expression is assigned to Runnable reference.
        //    Runnable is a Functional Interface (has only one abstract method: run()).
        //
        //    Internally:
        //    - Compiler converts this lambda into an implementation of Runnable.
        //    - It creates an anonymous Runnable object.
        Runnable r = () -> {

            // 6. This run() method will be executed by the NEW thread,
            //    not by the main thread.

            for (int i = 1; i <= 5; i++) {

                // 7. Child thread prints this message.
                //    Thread state here = RUNNING.
                System.out.println("child thread");
            }

            // 8. After loop completes, run() method ends.
            //    Thread state becomes TERMINATED.
        };

        // 3. Thread object is created.
        //    At this point:
        //    - No new thread is created yet.
        //    - Only Thread object is created.
        Thread t = new Thread(r);

        // 4. start() method is called.
        //
        //    Internally:
        //    - JVM creates a new thread.
        //    - Allocates separate call stack.
        //    - Thread state changes to RUNNABLE.
        //    - Thread scheduler decides when to execute run().
        t.start();

        // 5. Main thread continues execution independently.
        //    It does NOT wait for child thread.

        for (int i = 1; i <= 5; i++) {

            // 9. Main thread prints this message.
            //    Now both main thread and child thread
            //    are executing concurrently.
            System.out.println("main thread ");
        }

        // 10. After this loop,
        //     main thread execution completes.
        //     Main thread becomes TERMINATED.
    }
}