class MyThread_4 extends Thread {

    @Override
    public void run() {

        for (int i = 1; i <= 5; i++) {
            System.out.println("Child Thread executing: " + i);

            try {
                Thread.sleep(500); // slow down for clarity
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Join_Method_Eg1 {

    public static void main(String[] args) throws InterruptedException {

        MyThread_4 t = new MyThread_4();

        t.start();   // Child thread starts

        // Main thread waits until child thread completes
        t.join();

        // This line executes only after child thread finishes
        System.out.println("Main thread continues after child finishes");
    }
}