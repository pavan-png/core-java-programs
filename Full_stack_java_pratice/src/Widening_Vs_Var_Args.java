public class Widening_Vs_Var_Args {

    // Overload that accepts a wider primitive type.
    public static void m1(long l ){
        System.out.println("Widening");
    }
    // Overload that accepts any number of int values (var-args becomes int[]).
    public  static  void  m1( int... i){  // int[] i done by compiler
        System.out.println("var args");
    }
    public static void main(String[] args) {
        // int literal assigned to primitive int.
        int i =99;
        // Overload resolution prefers primitive widening over var-args.
        m1(i); // int ====> widening ======> long (match)
        // Even though int can match both widening and var-args,
        // var-args is always the lowest priority in overload resolution.
    }
}
