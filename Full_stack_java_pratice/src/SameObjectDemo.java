class X1 {

    // Synchronized method → requires object lock
    synchronized void m1() {

        System.out.println(Thread.currentThread().getName() + " entered m1()");

        try {
            Thread.sleep(3000);  // simulate long task
        } catch (InterruptedException e) {}

        System.out.println(Thread.currentThread().getName() + " exiting m1()");
    }

    // Another synchronized method → requires same object lock
    synchronized void m2() {

        System.out.println(Thread.currentThread().getName() + " entered m2()");
        System.out.println(Thread.currentThread().getName() + " exiting m2()");
    }

    // Non-synchronized method → no lock required
    void m3() {

        System.out.println(Thread.currentThread().getName() + " executing m3()");
    }
}
class Thread1 extends Thread {

    X1 obj;

    Thread1(X1 obj) {
        this.obj = obj;
    }

    public void run() {
        obj.m1();   // needs object lock
    }
}

class Thread2 extends Thread {

    X1 obj;

    Thread2(X1 obj) {
        this.obj = obj;
    }

    public void run() {
        obj.m2();   // needs same object lock
    }
}

class Thread3 extends Thread {

    X1 obj;

    Thread3(X1 obj) {
        this.obj = obj;
    }

    public void run() {
        obj.m3();   // does NOT need lock
    }
}
public class SameObjectDemo {

    public static void main(String[] args) {

        X1 obj = new X1();   // Only ONE object

        Thread1 t1 = new Thread1(obj);
        Thread2 t2 = new Thread2(obj);
        Thread3 t3 = new Thread3(obj);

        t1.setName("T1");
        t2.setName("T2");
        t3.setName("T3");

        t1.start();
        t2.start();
        t3.start();
    }
}