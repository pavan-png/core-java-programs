public class Static_Block_Execution {
    static int a ;
    static {
        a = 10;
        System.out.println("this is static block");
    }

    public static void main(String[] args) {

        System.out.println("this is main method");
    }
}
