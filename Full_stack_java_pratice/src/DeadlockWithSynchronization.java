class Person3 extends Thread {

    Person4 p4;

    Person3(Person4 p4) {
        this.p4 = p4;
    }

    public void run() {

        synchronized(this) {

            System.out.println("Person3 got lock on Person3 object");

            try {
                System.out.println("Person3 waiting for Person4 to finish...");
                p4.join();   // Person3 waits for Person4
            } catch (Exception e) {}
        }
    }
}


class Person4 extends Thread {

    Person3 p3;

    Person4(Person3 p3) {
        this.p3 = p3;
    }

    public void run() {

        synchronized(this) {

            System.out.println("Person4 got lock on Person4 object");

            try {
                System.out.println("Person4 waiting for Person3 to finish...");
                p3.join();   // Person4 waits for Person3
            } catch (Exception e) {}
        }
    }
}



public class DeadlockWithSynchronization {

    public static void main(String[] args) {

        Person3 p3 = new Person3(null);
        Person4 p4 = new Person4(p3);

        p3.p4 = p4;

        p3.start();
        p4.start();
    }
}