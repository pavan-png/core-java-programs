public class Widening_Vs_Var_Args {

    public static void m1(long l ){
        System.out.println("Widening");
    }
    public  static  void  m1( int... i){  // int[] i done by compiler
        System.out.println("var args");
    }
    public static void main(String[] args) {
        int i =99;
        m1(i); // int ====> typecasting ======> long ( match )
         // even though int primitive data can sit on long and var args , primitive type is given highest priority,
        // always varargs is given least priority.
    }
}
