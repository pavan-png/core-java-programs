class ThreadD extends Thread{
    int total =0;

    @Override
    public void run() {

        for (int i = 0; i <= 50; i++) {
            total = total + i;
        }
        // may be some 10k  lines of code
    }
}
public class Thread_Without_Communication_Using_Join_Method {
    public static void main(String[] args) throws Exception{
        ThreadD t = new ThreadD();

        t.start();

        /* main thread (5)  , child thread (5)  by default main thread will  get a chance , and child
        will have same priority as parent.
        */


        System.out.println(t.total);

        /* here main thread get the total value before the child thread executes the run method.
         so 0 is printed.
         */


        /*
        when join method is executed by main thread it will go into waiting state , until the child thread
        completes its execution , after the execution of the child thread , main thread will continue its execution
        and gets the updated value of the total variable.

        */
        t.join();

        System.out.println(t.total);


        /*
        here if join method is used main thread has to be in waiting state until the child completes its execution
        if there are 10k lines in child thread then main thread has to wait until the  child completes the execution
        even though the total variable is available main thread has to wait until the child thread completes.
         */

    }
}
