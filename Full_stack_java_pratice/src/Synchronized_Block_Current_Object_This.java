class Display_7 {
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
class Mythread_26 extends Thread {
    Display_7 d ;
    String name;

    public Mythread_26(Display_7 d , String name ){
        this.d = d;
        this.name = name;
    }
    @Override
    public void  run () {
        d.wish(name);
    }
}

public class Synchronized_Block_Current_Object_This {
    public static void main(String[] args) {
        Display_7 obj = new Display_7();
        Mythread_26 t = new Mythread_26(obj,"pavan");
        t.setName("pavan");
        t.start();
        Mythread_26 t1 = new Mythread_26(obj, "charan");
        t1.setName("charan");
        t1.start();
    }
}
