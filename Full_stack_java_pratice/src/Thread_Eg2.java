// Runnable implementation
class Counter_1 implements Runnable {

    // Static variable shared by ALL threads
    public static int i = 3;

    @Override
    public void run() {

        /*
        This method is executed by whichever thread
        gets CPU from the Thread Scheduler (TS).

        Thread.currentThread().getName()
        → returns the name of the thread executing run()

        i--
        → prints current value of i
        → then decrements i by 1
        */

        System.out.println(Thread.currentThread().getName() + " : " + i--);
    }
}

public class Thread_Eg2 {

    public static void main(String[] args) {

        /*
        Step 1
        Creating an object of Counter_1
        */
        Counter_1 c = new Counter_1();

        /*
        Step 2
        Creating three threads
        */
        Thread t1 = new Thread(c);
        Thread t2 = new Thread(new Counter_1());
        Thread t3 = new Thread(new Counter_1());

        /*
        Step 3
        Storing threads in an array
        */
        Thread[] arr = {t1, t2, t3};

        /*
        Step 4
        Starting all threads
        */
        for (Thread ts : arr) {
            ts.start();
        }

    }
}