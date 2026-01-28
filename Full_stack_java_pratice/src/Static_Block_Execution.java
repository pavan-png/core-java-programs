public class Static_Block_Execution {

    static int a;

    static {
        a = 10;
        System.out.println("Static block executed");
    }

    public static void main(String[] args) {
        System.out.println("Main method executed");
        System.out.println(a);
    }
}
