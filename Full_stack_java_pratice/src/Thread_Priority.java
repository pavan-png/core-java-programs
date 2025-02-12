class Mythread_8 extends Thread{
    @Override
    public void run() {
        for (int i =0 ; i<=5; i++){
            System.out.println("child thread" + Thread.currentThread().getPriority());
        }
    }
}
public class Thread_Priority {
    public static void main(String[] args) {
        Mythread_8 t = new Mythread_8(); // child thread is created
        t.setPriority(7);
        /* we are setting the child thread priority to 7.
         */
        t.start();
        for (int i =1; i<=5;i++){
            System.out.println("main thread"+Thread.currentThread().getPriority());
        }

    }
}
