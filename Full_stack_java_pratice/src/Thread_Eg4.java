class MyThread extends Thread{
    MyThread(){

    }
    MyThread(Runnable r){
        super(r);
    }

    @Override
    public void run() {
        System.out.println("Inside Runnable");
    }
}
class RunnableDemo implements Runnable{
    @Override
    public void run() {
        System.out.println("inside runnable");
    }
}
public class Thread_Eg4 {
    public static void main(String[] args) {
        new MyThread().start();

        new MyThread(new RunnableDemo()).start();
        /*
        the above line will make a call to the parameterized constructor of MyThread().
        and  parameterized super(r) make a call to Thread class parameterized constructor.
        and after that current object start() method is called. which internally a make a call to run() method.
         */
    }
}
