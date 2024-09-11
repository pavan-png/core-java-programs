class ThreadE extends Thread{
    int total =0;

    @Override
    public void run() {
        /* step2 :
        child thread is given a chance to executes and gives a notify call to main method
         */
        synchronized (this) {
            System.out.println("child thread started the calculation");
            for (int i = 0; i <= 50; i++) {
                total = total + i;
            }
            System.out.println("child thread after notify call ");
            this.notify();
        }

    }
}
public class Inter_Thread_Communication_With_Sleep_Method {
    public static void main(String[] args) throws InterruptedException{
       // step1:
        ThreadD t = new ThreadD();
        t.start();
       //  two threads main (5) , child (5)


        Thread.sleep(3000);
        /* main thread will enter into sleeping , in the mean time thread scheduler gives the chance to
        child thread

         */


        /* step2:
        when child thread gives the notify call the main thread is in sleeping state , after some time main thread will wake up
        and continue its execution. and when main thread executes wait method , it will wait for notify call by  child thread
        but child thread already completed its execution and entered into dead state, so this wait  by main thread will be infinite
         */
        synchronized (t){

            System.out.println("main thread calling wait method");
            t.wait();



            System.out.println("main thread gets notify call");

            System.out.println(t.total);
        }

    }
}
