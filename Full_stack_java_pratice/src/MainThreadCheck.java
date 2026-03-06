public class MainThreadCheck {

    public static void main(String[] args) {

        System.out.println("Is main thread daemon? "
                + Thread.currentThread().isDaemon());

        /*
        Output:
        false

        Explanation:

        Main thread is created by JVM.

        It is always a NON-DAEMON thread.

        Its daemon nature cannot be changed.
        */
    }
}