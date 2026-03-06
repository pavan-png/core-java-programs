public class Synchronized_Block_Using_This_On_Different_Objects {

    public static void main(String[] args) {

        Display_SB1 obj1 = new Display_SB1();
        Display_SB1 obj2 = new Display_SB1();

        MyThread_SB1 t1 = new MyThread_SB1(obj1);
        MyThread_SB1 t2 = new MyThread_SB1(obj2);

        t1.start();
        t2.start();
    }
}