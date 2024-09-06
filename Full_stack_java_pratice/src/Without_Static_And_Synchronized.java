class Display_5{
    public  void display_Numbers(){
        for(int i =1 ; i<=10;i++){
            System.out.print(i);
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                System.out.println("thread executing display numbers method is interrupted");
            }
        }
    }
    public  void display_Characters(){
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
class Mythread_22 extends Thread{
    Display_5 d;
    Mythread_22(Display_5 d){
        this.d = d;
    }

    @Override
    public void run() {
        d.display_Numbers();
    }
}
class Mythread_23 extends Thread{
    Display_5 d ;
    Mythread_23(Display_5 d){
        this.d = d;
    }

    @Override
    public void run() {
        d.display_Characters();
    }
}
public class Without_Static_And_Synchronized {
    public static void main(String[] args) {
        Display_5 obj = new Display_5();
        Mythread_22 obj1 = new Mythread_22(obj);
        Mythread_23 obj2 = new Mythread_23(obj);
        obj1.start();
        obj2.start();

    }
}
