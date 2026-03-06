class SharedResource {

    public synchronized void waitMethod() {
        try {
            System.out.println(Thread.currentThread().getName() + " got lock and calling wait()");

            wait(); // releases lock

            System.out.println(Thread.currentThread().getName() + " resumed after wait()");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void notifyMethod() {

        System.out.println(Thread.currentThread().getName() + " got lock and calling notify()");

        notify();

        System.out.println(Thread.currentThread().getName() + " still holding lock after notify()");
    }
}

public class WaitNotifyExample {

    public static void main(String[] args) {

        SharedResource obj = new SharedResource();

        Thread t1 = new Thread(() -> {
            obj.waitMethod();
        }, "Thread-1");

        Thread t2 = new Thread(() -> {

            try {
                Thread.sleep(2000);
            } catch (Exception e) {}

            obj.notifyMethod();

        }, "Thread-2");

        t1.start();
        t2.start();
    }
}