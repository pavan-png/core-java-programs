class Display {

    // 1. This method is NOT synchronized.
    //    So multiple threads can execute it at the same time.
    public void wish(String name) {

        // 2. Loop runs 5 times.
        for (int i = 1; i <= 5; i++) {

            // 3. Printing message.
            //    Since no synchronization,
            //    two threads may execute this simultaneously.
            System.out.println("Hello : " + name);
        }
    }
}

class Mythread_15 extends Thread {

    Display d;
    String name;

    // 4. Constructor to initialize object reference and name.
    Mythread_15(Display d, String name) {
        this.d = d;
        this.name = name;
    }

    @Override
    public void run() {

        // 6. Each thread calls same Display object method.
        d.wish(name);
    }
}

public class Problem_Without_Synchronization {

    public static void main(String[] args) {

        // 1. One Display object is created.
        //    Both threads will share this SAME object.
        Display d = new Display();

        // 2. First thread created
        Mythread_15 t = new Mythread_15(d, "pavan");

        // 3. Second thread created
        Mythread_15 t1 = new Mythread_15(d, "anand");

        // 4. Both threads started.
        //    Now they run concurrently.
        t.start();
        t1.start();

        // 5. Since wish() method is NOT synchronized:
        //    - Both threads enter wish() at same time.
        //    - Their outputs may mix.
        //    - Order is NOT predictable.
    }
}