class Demo3 {
    int a;
    int b;
    int result;

    {
        a = 10;
        b = 15;
        result = a + b;
        System.out.println("Non-static block executed");
    }

    Demo3() {
        System.out.println("Constructor executed");
        System.out.println("Result = " + result);
    }
}

public class Non_Static_Block_Execution {
    public static void main(String[] args) {
        new Demo3();
        new Demo3();
    }
}
