class Display_3{
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
    public static synchronized void display_Characters(){
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
class Mythread_18 extends Thread {
    @Override
    public void run() {
        Display_3.display_Numbers();
    }
}
class Mythread_19 extends Thread{
    @Override
    public void run() {
        Display_3.display_Characters();
    }
}
public class Static_Synchronized_Method {
    public static void main(String[] args) {
        Mythread_18 obj1 = new Mythread_18();
        Mythread_19 obj2 = new Mythread_19();
        obj1.start();
        obj2.start();
    }
}
