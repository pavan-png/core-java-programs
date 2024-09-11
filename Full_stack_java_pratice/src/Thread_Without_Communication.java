class ThreadC extends Thread{
    int total =0;

    @Override
    public void run() {


            for (int i = 0; i <= 50; i++) {
                total = total + i;
            }
    }
}
public class Thread_Without_Communication {
    public static void main(String[] args) throws InterruptedException
    {
        ThreadC t = new ThreadC();
        t.start();

        /* main thread (5)  , child thread (5)  by default main thread will  get a chance , and child
        will have same priority as parent.
        */


        System.out.println(t.total);

        /* here main thread get the total value before the child thread executes the run method.
         so 0 is printed.
         */


        /* static method so called with class name
        when sleep method is applied on main thread , it will sleep for 2sec , in that mean time child thread
        will complete its execution and total value will be updated .
        */
        ThreadC.sleep(2000);
        System.out.println(t.total);


        /*
        here we are not effectively using the cpu time , performance is low . this problem will be prevented
        by using inter-thread communication
         */

    }
}
