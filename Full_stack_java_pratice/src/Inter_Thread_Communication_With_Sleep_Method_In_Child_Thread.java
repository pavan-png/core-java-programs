class ThreadG extends Thread{
    int total =0;

    @Override
    public void run() {
        synchronized (this) {
            /*
            step2:
            now lock on object t is available with child thread , and lock on object is applied
            and child thread started executing the below code.

             */
            System.out.println("child thread started the calculation");
            for (int i = 0; i <= 50; i++) {
                total = total + i;
            }
            System.out.println("child thread after notify call ");
            try {
                // child thread sleeps/ waiting state for 3 sec and then continues with execution
                Thread.sleep(3000);
            }catch (InterruptedException e){
                System.out.println("interrupted Exception");
            }


            this.notify();
            /*
            step3 :
            when the child thread executed notify method , it may (or) not release the lock on object immediately
            due to which main thread enters into another waiting state
             */
        }

    }
}
public class Inter_Thread_Communication_With_Sleep_Method_In_Child_Thread {
    public static void main(String[] args) throws InterruptedException{
        ThreadG t = new ThreadG();
        t.start();

        // here two threads are starting with same priority 5.  main ,child
        synchronized (t){
            /*
            step1 :
             main thread has the lock of object and executes the below two lines ,
            after executing the wait method main thread
            opens the lock on object t, and enters into waiting state.

             */
            System.out.println("main thread calling wait method");
            t.wait();


            /*
            step4: when main thread got the lock from child thread , again lock is appield on object by main thread
             and , it will continue its execution
             */
            System.out.println("main thread gets notify call");

            System.out.println(t.total);
        }


    }
}
