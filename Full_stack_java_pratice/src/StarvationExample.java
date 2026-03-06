class StarvationDemo extends Thread {

    public void run() {

        // Printing thread name and priority
        for(int i = 1; i <= 5; i++) {

            System.out.println(Thread.currentThread().getName()
                    + " executing with priority "
                    + Thread.currentThread().getPriority());

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
            }
        }
    }
}

public class StarvationExample {

    public static void main(String[] args) {

        StarvationDemo high1 = new StarvationDemo();
        StarvationDemo high2 = new StarvationDemo();
        StarvationDemo low = new StarvationDemo();

        // Setting thread names
        high1.setName("High Priority Thread 1");
        high2.setName("High Priority Thread 2");
        low.setName("Low Priority Thread");

        // Setting priorities
        high1.setPriority(Thread.MAX_PRIORITY); // 10
        high2.setPriority(Thread.MAX_PRIORITY); // 10

        low.setPriority(Thread.MIN_PRIORITY); // 1

        // Start threads
        high1.start();
        high2.start();
        low.start();

        /*
        Explanation:

        Scheduler prefers high priority threads.

        So:
        High priority threads execute first.

        The low priority thread waits for a long time.

        After high priority threads finish,
        the low priority thread finally executes.

        This long waiting is called Starvation.
        */
    }
}
