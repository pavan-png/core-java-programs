public class Static_block {
    static  String a = " static variable outside static block   2" ;
    static {
        int a = 1;
        // one variable can be used in other variable.`
        String  b = " static variable inside static block  "  + a;
        System.out.println(b);
    }

    public static void main(String[] args) {
        System.out.println(a);
    }
}
