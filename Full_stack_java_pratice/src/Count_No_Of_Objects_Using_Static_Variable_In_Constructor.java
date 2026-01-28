class Demo2 {
    static int count;

    Demo2() {
        count++;
    }
}

public class Count_No_Of_Objects_Using_Static_Variable_In_Constructor {
    public static void main(String[] args) {

        new Demo2();
        new Demo2();
        new Demo2();

        System.out.println("Total objects = " + Demo2.count);
    }
}
