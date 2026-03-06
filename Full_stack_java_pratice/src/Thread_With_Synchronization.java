class Display_1 {

    // 1. synchronized keyword is applied to this method.
    //    It means:
    //    Only ONE thread can execute this method
    //    at a time on the SAME object.

    public synchronized void wish(String name) {

        // 5. When a thread enters here,
        //    it gets the LOCK of object (obj).
        //    Other threads must WAIT.

        for (int i = 1; i <= 5; i++) {

            // 6. Only one thread prints completely.
            System.out.println("Hey " + name);

            try {
                Thread.sleep(2000);
            }
            catch (InterruptedException e) {
                System.out.println("thread interrupted");
            }
        }

        // 7. After loop finishes,
        //    lock is released automatically.
        //    Now another waiting thread can enter.
    }
}

class Mythread_16 extends Thread {

    Display_1 d;
    String name;

    public Mythread_16(Display_1 d, String name) {
        this.d = d;
        this.name = name;
    }

    @Override
    public void run() {

        // 4. Each thread tries to call same object method.
        d.wish(name);
    }
}

public class Thread_With_Synchronization {

    public static void main(String[] args) {

        // 1. Only ONE object is created.
        Display_1 obj = new Display_1();

        // 2. Two threads are created.
        //    Both share SAME object.
        Mythread_16 t = new Mythread_16(obj, "pavan");
        Mythread_16 t1 = new Mythread_16(obj, "charan");

        // 3. Both threads start.
        t.start();
        t1.start();

        // 8. Because method is synchronized:
        //    If t gets lock first,
        //    t1 must WAIT until t finishes.
    }
}