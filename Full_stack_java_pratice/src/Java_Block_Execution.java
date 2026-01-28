class Demo4 {

    static int count;

    {
        count++;
        System.out.println("Non-static block executed");
    }

    Demo4() {
        this(10);
        System.out.println("Constructor 1");
    }

    Demo4(int a) {
        System.out.println("Constructor 2");
    }

    Demo4(int a, int b) {
        System.out.println("Constructor 3");
    }
}

public class Java_Block_Execution {
    public static void main(String[] args) {

        new Demo4();
        new Demo4(10);
        new Demo4(10, 20);

        System.out.println("Total objects = " + Demo4.count);
    }
}
