class ResourceAll {

    public synchronized void waitMethod() {
        try {

            System.out.println(Thread.currentThread().getName() + " waiting");

            wait();

            System.out.println(Thread.currentThread().getName() + " resumed execution");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void notifyAllMethod() {

        System.out.println("notifyAll() called");

        notifyAll();
    }
}

public class NotifyAllExample {

    public static void main(String[] args) throws Exception {

        ResourceAll obj = new ResourceAll();

        Thread t1 = new Thread(obj::waitMethod, "Thread-1");
        Thread t2 = new Thread(obj::waitMethod, "Thread-2");
        Thread t3 = new Thread(obj::waitMethod, "Thread-3");

        t1.start();
        t2.start();
        t3.start();

        Thread.sleep(2000);

        new Thread(obj::notifyAllMethod).start();
    }
}