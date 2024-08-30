class Mythread_4 extends Thread{

    public void run() {
        System.out.println("no arg run method");
    }
    public void start(){
        System.out.println("Mythread class overriding start method ");
    }
}
public class Thread_Start_Method_Overriding {
    public static void main(String[] args) {
        Mythread_4 obj = new Mythread_4();
        obj.start();

    }
}
