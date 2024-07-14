public class AutoBoxing_Vs_Var_Args {
    public static void m1(Integer i){
        System.out.println("AutoBoxing");
    }
    public static void m1(int... i){
        System.out.println("variable arguments ");
    }
    public static void main(String[] args) {
            int x =10;
            m1(10);         // 1st  perference int ======> implicit typecasting / widening ==========> long , float, double
                              // 2nd preference  int ======> AutoBoxing========> Integer
    }
}
