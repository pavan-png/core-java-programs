class Person1 extends Thread {

    Person2 p2;

    Person1(Person2 p2) {
        this.p2 = p2;
    }

    public void run() {

        try {
            System.out.println("Person1 waiting for Person2 to finish...");
            p2.join();   // p1 waits for p2
        } catch (InterruptedException e) {}

        DeadLockWithoutSynchronization.cookies = DeadLockWithoutSynchronization.cookies + 1;
        System.out.println("Person1 added a cookie. Total: " +DeadLockWithoutSynchronization.cookies);
    }
}


class Person2 extends Thread {

    Person1 p1;

    Person2(Person1 p1) {
        this.p1 = p1;
    }

    public void run() {

        try {
            System.out.println("Person2 waiting for Person1 to finish...");
            p1.join();   // p2 waits for p1
        } catch (InterruptedException e) {}

        DeadLockWithoutSynchronization.cookies = DeadLockWithoutSynchronization.cookies + 1;
        System.out.println("Person2 added a cookie. Total: " + DeadLockWithoutSynchronization.cookies);
    }
}


public class DeadLockWithoutSynchronization {

    static int cookies = 0;

    public static void main(String[] args) {

        Person1 p1 = new Person1(null);
        Person2 p2 = new Person2(p1);

        p1.p2 = p2;

        p1.start();
        p2.start();
    }
}