// Display class which contains the synchronized block
class Display_SB2 {

    // This object will be used as a lock
    Display_SB2 lock;

    // Constructor receives the lock object
    Display_SB2(Display_SB2 lock){
        this.lock = lock;
    }

    // Method executed by multiple threads
    void display(){

        // synchronized block using Display_SB2 object as lock
        synchronized(lock){

            for(int i = 1; i <= 5; i++){

                System.out.print(i);

                try{
                    // sleep just to clearly observe thread behaviour
                    Thread.sleep(500);
                }
                catch(InterruptedException e){}

            }

            System.out.println();
        }
    }
}


// Thread class
class MyThread_SB2 extends Thread {

    Display_SB2 d;

    // constructor receiving shared object
    MyThread_SB2(Display_SB2 d){
        this.d = d;
    }

    // run() executed when thread starts
    public void run(){
        d.display();
    }
}


// Main class
public class Lock_Object_Example {

    public static void main(String[] args) {

        // Creating a separate Display object that will act as LOCK
        Display_SB2 lockObject = new Display_SB2(null);

        // Creating shared object which will use lockObject for synchronization
        Display_SB2 obj = new Display_SB2(lockObject);

        // Creating two threads sharing same object
        MyThread_SB2 t1 = new MyThread_SB2(obj);
        MyThread_SB2 t2 = new MyThread_SB2(obj);

        // starting threads
        t1.start();
        t2.start();
    }
}