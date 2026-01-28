class Order {

    // 1. static variables
    static int a = 10;
    static int b = 20;

    // 2. static block
    static {
        System.out.println("1. static block");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("--------------------------------");
    }

    // 3. instance variables
    int c = 30;
    int d = 40;

    // 4. instance block
    {
        System.out.println("3. instance block");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("--------------------------------");
    }

    // 5. constructor
    Order() {
        System.out.println("4. constructor");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("--------------------------------");
    }

    // 6. non-static method
    void nonStaticMethod() {
        System.out.println("5. non-static method");
    }
}

public class Order_Of_Execution {
    public static void main(String[] args) {

        System.out.println("2. main method");
        System.out.println("--------------------------------");

        Order obj = new Order();   // triggers instance flow
        obj.nonStaticMethod();
    }
}
