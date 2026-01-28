public class Automatic_Execution {

    static int a;
    static int b;

    static {
        a = 10;
        b = 24;
        System.out.println("static block executed");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public static void main(String[] args) {
        System.out.println("main method executed");
    }
}
