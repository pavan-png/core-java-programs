public class DifferentObjectDemo {

    public static void main(String[] args) {

        X1 obj1 = new X1();   // First object
        X1 obj2 = new X1();   // Second object

        Thread1 t1 = new Thread1(obj1);  // uses obj1
        Thread2 t2 = new Thread2(obj2);  // uses obj2

        t1.setName("T1");
        t2.setName("T2");

        t1.start();
        t2.start();
    }
}