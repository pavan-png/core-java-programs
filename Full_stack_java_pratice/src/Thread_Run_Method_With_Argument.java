class Mythread_3  extends Thread{

    public void run() {
        System.out.println("run with no argument method");
    }

    public void run(int x){
        System.out.println("run with argument");
    }

}
public class Thread_Run_Method_With_Argument {
    public static void main(String[] args) {
        Mythread_3 obj = new Mythread_3();
        obj.start();
    }
}
