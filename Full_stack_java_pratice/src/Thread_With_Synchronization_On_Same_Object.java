class Display_1{
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
class Mythread_16 extends Thread {
    Display_1 d ;
    String name;

    public Mythread_16(Display_1 d , String name ){
        this.d = d;
        this.name = name;
    }
    @Override
    public void  run () {
        d.wish(name);
    }
}
public class Thread_With_Synchronization_On_Same_Object{
    public static void main(String[] args) {
        Display_1 obj = new Display_1();
        Mythread_16 t = new Mythread_16(obj , "pavan");
        Mythread_16 t1 = new Mythread_16(obj,"charan");
        t.start();
        t1.start();
    }

}
