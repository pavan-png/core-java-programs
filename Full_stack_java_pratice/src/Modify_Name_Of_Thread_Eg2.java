class Mythread_6 extends Thread{
    public void run(){
        System.out.println("run executed by thread : " +Thread.currentThread().getName());
    }
}
public class Modify_Name_Of_Thread_Eg2 {
    public static void main(String[] args) {
        Mythread_6 t = new Mythread_6();
        t.start();
        System.out.println("main executed by thread : "+Thread.currentThread().getName());

    }
}
