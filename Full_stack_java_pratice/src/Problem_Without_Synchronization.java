class Display{
    public void wish(String name){
        for (int i = 1;i<=5;i++){
            System.out.println("Hello : "+name);
            try {
                Thread.sleep(2000);
            }
            catch (InterruptedException e ){
                System.out.println("thread is interrupted");
            }
        }
    }
}
class Mythread_15 extends Thread{
Display d ;
String name;
Mythread_15(Display d , String name){
    this.d = d;
    this.name = name;
}

    @Override
    public void run() {
        d.wish(name);
    }
}
public class Problem_Without_Synchronization {
    public static void main(String[] args) {
        Display d = new Display();
        Mythread_15 t = new Mythread_15(d,"pavan");
        t.start();
        Mythread_15 t1 = new Mythread_15(d , "anand");
        t1.start();

    }
}
