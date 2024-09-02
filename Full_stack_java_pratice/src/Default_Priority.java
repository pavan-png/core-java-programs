class Mythread_7 extends Thread{

}
public class Default_Priority {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(7);
        Mythread_7 obj = new Mythread_7();
        System.out.println(Thread.currentThread().getPriority());

    }
}
