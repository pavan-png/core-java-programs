
class Mythread_2 extends Thread{

}
public class Thread_Not_Overriding_Run_Method {
    public static void main(String[] args) {
        Mythread_2 obj = new Mythread_2();
        obj.start();
        for ( int i = 1 ; i <=10 ; i++){
            System.out.println("Main thread");
        }
    }
}
