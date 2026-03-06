class MultiLockExample {

    Object lock1 = new Object();
    Object lock2 = new Object();

    public void method() {

        synchronized (lock1) {

            System.out.println("Thread got lock1");

            synchronized (lock2) {

                System.out.println("Thread got lock2");

                try {

                    System.out.println("Thread calling wait on lock2");

                    lock2.wait();

                } catch (Exception e) {}
            }
        }
    }

    public void notifyMethod() {

        synchronized (lock2) {

            System.out.println("Notifier notifying");

            lock2.notify();
        }
    }
}

public class MultipleLockDemo {

    public static void main(String[] args) {

        MultiLockExample obj = new MultiLockExample();

        new Thread(obj::method).start();

        new Thread(() -> {

            try {
                Thread.sleep(2000);
            } catch (Exception e) {}

            obj.notifyMethod();

        }).start();
    }
}