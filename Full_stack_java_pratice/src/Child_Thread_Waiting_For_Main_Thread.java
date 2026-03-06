class MyThread_5 extends Thread {

    static Thread mainThread;

    @Override
    public void run() {

        try {
            // Child thread waits for main thread
            mainThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Child thread resumes after main thread finishes");
    }
}

public class Child_Thread_Waiting_For_Main_Thread {

    public static void main(String[] args) {

        MyThread_5.mainThread = Thread.currentThread();

        MyThread_5 t = new MyThread_5();
        t.start();

        System.out.println("Main thread work completed");
    }
}
