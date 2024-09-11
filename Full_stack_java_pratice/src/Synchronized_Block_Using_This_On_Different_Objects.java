class Display_8 {
    public void wish(String name) {
        System.out.println("statement-1 before synchronized block");
        System.out.println("statement-2 before synchronized block");
        // the above 2 statements can be executed by any thread we cant predict the output, since it is not synchronized
        synchronized (this) {
            System.out.println("thread which is getting locked : "+Thread.currentThread().getName());
            for (int i = 1; i <= 5; i++) {
                System.out.println("Hey " + name);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    System.out.println("thread interrupted");
                }
            }
            System.out.println("lock on thread which is getting released : "+Thread.currentThread().getName());
        }
    }
}
class Mythread_27 extends Thread {
    Display_8 d ;
    String name;

    public Mythread_27(Display_8 d , String name ){
        this.d = d;
        this.name = name;
    }
    @Override
    public void  run () {
        d.wish(name);
    }
}

public class Synchronized_Block_Using_This_On_Different_Objects {
    public static void main(String[] args) {
        Display_8 obj = new Display_8();
        Display_8 obj1 = new Display_8();
        Mythread_27 t = new Mythread_27(obj,"pavan");
        t.setName("pavan");
        t.start();
        Mythread_27 t1 = new Mythread_27(obj1, "charan");
        t1.setName("charan");
        t1.start();

    }
}
