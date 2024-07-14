// Overloading compiler role is more
public class AutoBoxing_Vs_Widening {
    public static void m1(long l ){
        System.out.println("widening");
    }

    public static void m1(Integer i){
        System.out.println("AutoBoxing");
    }
    public static void main(String[] args) {
     int x = 10; // compiler will do implicit type casting .
        // x is int (primitive)  =======> typecasting ===========> Long .
     m1(x);
    }
}
