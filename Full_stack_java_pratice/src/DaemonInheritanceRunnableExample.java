
// Child Runnable
class ChildRunnable implements Runnable {

    public void run() {

        // Child inherits daemon status from parent daemon thread automatically
        System.out.println("Child thread is daemon: "
                + Thread.currentThread().isDaemon()); // true (inherited)
    }
}


// Parent Runnable
class ParentRunnable implements Runnable {

    public void run() {

        System.out.println("Parent thread is daemon: "
                + Thread.currentThread().isDaemon()); // true

        // Child thread created INSIDE parent daemon thread
        // It automatically inherits daemon = true from parent

        Thread childThread = new Thread(new ChildRunnable());

        System.out.println("Child thread is daemon (before start): "
                + childThread.isDaemon()); // true (inherited)

        childThread.start();
    }
}


// Main Application Class
public class DaemonInheritanceRunnableExample {

    public static void main(String[] args) throws InterruptedException {

        // Main thread is non-daemon by default
        System.out.println("Main thread is daemon: "
                + Thread.currentThread().isDaemon()); // false


        // Create parent thread and explicitly mark it as daemon
        Thread parentThread = new Thread(new ParentRunnable());

        // must be called BEFORE start()
        parentThread.setDaemon(true);

        parentThread.start();


        // Give daemon threads a moment to print their output
        Thread.sleep(500);

        System.out.println("Main thread finished.");
    }
}