class Resource {

    public synchronized void waitingMethod() {
        try {
            System.out.println(Thread.currentThread().getName() + " is waiting");

            wait();

            System.out.println(Thread.currentThread().getName() + " got notification");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void notifyMethod() {
        System.out.println("Notifier thread calling notify()");
        notify();
    }
}

public class NotifyOneThreadExample {

    public static void main(String[] args) throws Exception {

        Resource obj = new Resource();

        Thread t1 = new Thread(obj::waitingMethod, "Thread-1");
        Thread t2 = new Thread(obj::waitingMethod, "Thread-2");
        Thread t3 = new Thread(obj::waitingMethod, "Thread-3");

        t1.start();
        t2.start();
        t3.start();

        Thread.sleep(2000);

        Thread notifier = new Thread(() -> {
            obj.notifyMethod();
        });

        notifier.start();
    }
}