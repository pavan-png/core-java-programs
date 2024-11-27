public class Array_Eg24 {
     static final int[] a = { 100,200 };
     static final int[] b;
     static {
         b=new int[2];
         b[0]=100;
         b[1]=200;
     }
    //  static final int[] c = new int[2]{100,200};  size should not be declared

    /* static final int[] d;
    static void init() {
        d = new int[3]; d[0]=100; d[1]=200; }
     */

    /*
    if a variable is static an final the only place where we can initialize is
    1. at the time of declaration
    2. inside static block
     */
    public static void main(String[] args) {
    }
}
