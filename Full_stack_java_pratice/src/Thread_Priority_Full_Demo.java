// Complete Demonstration of Thread Priority Concepts

class MyThread_3 extends Thread {

    MyThread_3(String name) {
        super(name); // setting thread name using parent constructor
    }

    @Override
    public void run() {

        // Printing current thread name and priority
        for (int i = 1; i <= 5; i++) {
            System.out.println(
                    "Running Thread : " + Thread.currentThread().getName()
                            + " | Priority : " + Thread.currentThread().getPriority()
            );
        }
    }
}

public class Thread_Priority_Full_Demo {

    public static void main(String[] args) {

        /*
         * STEP 1:
         * When JVM starts a program, it automatically creates MAIN thread.
         * Default priority of main thread is 5.
         */

        System.out.println("Main Thread Default Priority : "
                + Thread.currentThread().getPriority()); // should print 5


        /*
         * STEP 2:
         * Creating child thread BEFORE changing main thread priority.
         * This child will inherit default priority (5).
         */

        MyThread_3 child1 = new MyThread_3("Child-1");
        System.out.println("Child-1 Inherited Priority (Before changing main priority) : "
                + child1.getPriority());  // should print 5


        /*
         * STEP 3:
         * Now changing main thread priority to 8.
         * Valid range is 1 to 10.
         */

        Thread.currentThread().setPriority(8);

        System.out.println("Main Thread Priority After Change : "
                + Thread.currentThread().getPriority()); // should print 8


        /*
         * STEP 4:
         * Creating child thread AFTER changing main thread priority.
         * This child will inherit updated priority (8).
         */

        MyThread_3 child2 = new MyThread_3("Child-2");
        System.out.println("Child-2 Inherited Priority (After changing main priority) : "
                + child2.getPriority());  // should print 8


        /*
         * STEP 5:
         * Manually setting priority of child2 to 3.
         * We use setPriority() method to assign priority.
         */

        child2.setPriority(3);

        System.out.println("Child-2 Priority After Manual Setting : "
                + child2.getPriority());  // should print 3


        /*
         * STEP 6:
         * Demonstrating same priority case.
         * child3 and main thread both have priority 8.
         */

        MyThread_3 child3 = new MyThread_3("Child-3");
        System.out.println("Child-3 Inherited Priority : "
                + child3.getPriority());  // should print 8


        /*
         * If we try to set invalid priority (like 15),
         * JVM throws IllegalArgumentException.
         *
         * Uncomment below line to test:
         *
         * child3.setPriority(15);
         */


        /*
         * Starting threads.
         * Higher priority thread has higher chance to execute first.
         * But execution order is NOT guaranteed.
         * Scheduler behavior depends on OS + JVM.
         */

        child1.start();  // priority 5
        child2.start();  // priority 3
        child3.start();  // priority 8


        /*
         * Main thread also runs.
         * Main thread priority = 8.
         */

        for (int i = 1; i <= 5; i++) {
            System.out.println(
                    "Running Thread : " + Thread.currentThread().getName()
                            + " | Priority : " + Thread.currentThread().getPriority()
            );
        }


        /*
         * Final Important Observations:
         *
         * 1. Child threads inherit parent thread priority.
         * 2. Changing parent priority affects only future threads.
         * 3. Priority range is 1 to 10.
         * 4. Higher priority increases execution chance.
         * 5. Same priority execution order is unpredictable.
         * 6. Thread scheduling is platform dependent.
         * 7. Never depend on priority for program correctness.
         */
    }
}