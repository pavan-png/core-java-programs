class MyDaemonThread extends Thread {

    public void run() {

        while(true) {

            System.out.println("Daemon thread running in background...");

            try {
                Thread.sleep(1000);
            } catch(Exception e) {
            }
        }
    }
}

public class DaemonThreadExample {

    public static void main(String[] args) {

        MyDaemonThread t = new MyDaemonThread();

        // Making thread daemon
        t.setDaemon(true);

        // Starting daemon thread
        t.start();

        for(int i=1;i<=5;i++) {

            System.out.println("Main thread executing");

            try {
                Thread.sleep(500);
            } catch(Exception e) {
            }
        }

        /*
        Explanation:

        Main thread is a USER thread.

        The daemon thread runs in background.

        When main thread finishes execution,
        JVM terminates automatically.

        At that moment,
        daemon thread also stops automatically.
        */
    }
}