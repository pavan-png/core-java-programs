class Mythread_10 extends Thread{
    @Override
    public void run() {
        for (int i = 1 ; i<=5;i++){
            System.out.println("child thread");
        }
        try {
            Thread.sleep(2000);
        }
        catch (InterruptedException e){
        }


    }
}
public class Join_Method_Eg1 {
    public static void main(String[] args) throws InterruptedException {
        Mythread_10 t = new Mythread_10();
        t.start();
        t.join(3000);
        /* if the above line is commented we cant predict the output because it is  the duty of the thread scheduler
        to assign cpu time
        if the above line is not commented then main thread will enter into waiting state till child thread finishes its
        execution.

         */

        for (int i = 1;i<=5;i++){
            System.out.println("main thread");
        }


    }
}
