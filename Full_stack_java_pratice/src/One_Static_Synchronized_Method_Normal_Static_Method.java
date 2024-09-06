class Display_6{
    public static synchronized void display_Numbers(){
        for(int i =1 ; i<=10;i++){
            System.out.print(i);
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                System.out.println("thread executing display numbers method is interrupted");
            }
        }
    }
    public static void display_Characters(){
        for (int i = 65 ; i<=75;i++){
            System.out.print((char)i);
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e){
                System.out.println("thread executing display characters is interrupted");
            }
        }

    }
}
class Mythread_24 extends Thread {
    @Override
    public void run()
    {
        Display_6.display_Numbers();
    }
}
class Mythread_25 extends Thread{
    @Override
    public void run() {
        Display_6.display_Characters();
    }
}
public class One_Static_Synchronized_Method_Normal_Static_Method {
    public static void main(String[] args) {
        Mythread_24 obj1 = new Mythread_24();
        Mythread_25 obj2 = new Mythread_25();
        obj1.start();
        obj2.start();
    }
}
