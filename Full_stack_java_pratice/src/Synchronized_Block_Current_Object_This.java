class Display_SB1 {

    void displayNumbers() {

        // non-critical section
        System.out.println(Thread.currentThread().getName() + " entered method");

        synchronized(this) { // lock on current object

            for(int i=1;i<=5;i++) {

                System.out.print(i);

                try {
                    Thread.sleep(500);
                }
                catch (InterruptedException e) {}
            }

            System.out.println();
        }

        // remaining code can execute without lock
        System.out.println(Thread.currentThread().getName() + " leaving method");
    }
}

class MyThread_SB1 extends Thread {

    Display_SB1 d;

    MyThread_SB1(Display_SB1 d){
        this.d = d;
    }

    public void run(){
        d.displayNumbers();
    }
}

public class Synchronized_Block_Current_Object_This {

    public static void main(String[] args) {

        Display_SB1 obj = new Display_SB1();

        MyThread_SB1 t1 = new MyThread_SB1(obj);
        MyThread_SB1 t2 = new MyThread_SB1(obj);

        t1.start();
        t2.start();
    }
}