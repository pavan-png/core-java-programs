class Mythread_5 extends Thread{

    public void run() {
        System.out.println("this is thread class run method");
    }

    @Override
    public synchronized void start() {
        super.start();
        System.out.println("user defined start method ");
    }
}
public class User_Defined_Start_Method_Making_Call_To_Super_Start_Method {
    public static void main(String[] args) {
        Mythread_5 obj = new Mythread_5();
        obj.start();
        System.out.println("main method");

    }
}
