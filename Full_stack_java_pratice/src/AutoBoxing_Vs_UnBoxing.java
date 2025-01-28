public class AutoBoxing_Vs_UnBoxing {
    public static void m1( Long l){
        System.out.println("Long");
    }
    public static void m2(long i){
        System.out.println("int");
    }
    public static void main(String[] args) {
        int x = 10;
        Integer y = 20;
        m2(y); // autoboxing followed by widening / typecasting is allowed.
       // m1(x); compile time error widening followed by autoboxing is not allowed in java.


    }
}
