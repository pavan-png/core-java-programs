class LockTest {

    public synchronized void waitingMethod() {

        try {

            System.out.println(Thread.currentThread().getName() + " calling wait()");

            wait();

            System.out.println(Thread.currentThread().getName() + " resumed execution");

        } catch (Exception e) {}
    }

    public synchronized void notifyMethod() {

        System.out.println("Notifier calling notify()");
        notify();

        System.out.println("Notifier still inside synchronized block");

        try {
            Thread.sleep(5000);
        } catch (Exception e) {}

        System.out.println("Notifier exiting synchronized block");
    }
}

public class NotifyLockExample {

    public static void main(String[] args) {

        LockTest obj = new LockTest();

        new Thread(obj::waitingMethod, "Thread-1").start();

        new Thread(() -> {

            try {
                Thread.sleep(2000);
            } catch (Exception e) {}

            obj.notifyMethod();

        }, "Notifier").start();
    }
}