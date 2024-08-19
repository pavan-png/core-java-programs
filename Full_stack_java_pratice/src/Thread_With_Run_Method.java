
class Mythread_1 extends Thread{
    @Override

    public void run() {
        super.run();
        for ( int i = 1 ; i <=10 ; i++){
            System.out.println("child thread");
        }
    }
}
public class Thread_With_Run_Method {
    public static void main(String[] args) {
        Mythread_1 obj = new Mythread_1();
        obj.run();
        for ( int i = 1 ; i <=10 ; i++){
            System.out.println("Main thread");
        }
    }
}
