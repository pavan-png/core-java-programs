public class CheckDaemon {

    public static void main(String[] args) {

        Thread t = new Thread();

        // By default threads are non-daemon
        System.out.println("Is thread daemon? " + t.isDaemon());

        /*
        Output:
        false

        Explanation:

        Threads created by programmer are
        non-daemon threads by default.
        */
    }
}