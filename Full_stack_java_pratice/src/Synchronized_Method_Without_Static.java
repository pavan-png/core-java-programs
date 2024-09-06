class Display_4{
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
class Mythread_20 extends Thread{
    Display_4 d;
    Mythread_20(Display_4 d){
        this.d = d;
    }

    @Override
    public void run() {
        d.display_Numbers();
    }
}
class Mythread_21 extends Thread{
    Display_4 d ;
    Mythread_21(Display_4 d){
        this.d = d;
    }

    @Override
    public void run() {
        d.display_Characters();
    }
}
public class Synchronized_Method_Without_Static {
    public static void main(String[] args) {
        Display_4 obj = new Display_4();
        Mythread_20 obj1 = new Mythread_20(obj);
        Mythread_21 obj2 = new Mythread_21(obj);
        obj1.start();
        obj2.start();

    }
}
