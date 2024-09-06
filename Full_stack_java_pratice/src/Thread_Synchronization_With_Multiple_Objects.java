class Display_2{
    public  synchronized void  wish( String name){
        for (int i = 1 ; i<=5;i++ ){
            System.out.println("Hey "+name);
            try {
                Thread.sleep(2000);
            }
            catch (InterruptedException e){
                System.out.println("thread interrupted");
            }
        }
    }
}
class Mythread_17 extends Thread {
    Display_2 d ;
    String name;

    public Mythread_17(Display_2 d , String name ){
        this.d = d;
        this.name = name;
    }
    @Override
    public void  run () {
        d.wish(name);
    }
}
public class Thread_Synchronization_With_Multiple_Objects {
    public static void main(String[] args) {
        Display_2 obj = new Display_2();
        Display_2 obj1 = new Display_2();

        Mythread_17 t = new Mythread_17(obj , "pavan");
        Mythread_17 t1 = new Mythread_17(obj1 ,"tarun");
        t.start();
        t1.start();

    }
}
