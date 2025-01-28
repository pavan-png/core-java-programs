public class Conversion_AutoBoxing {
    public static void m1(Object o){
        System.out.println("Object");
    }
    public  static void m1( Number n){
        System.out.println("Number");
    }
    public  static void m1( Long l){
        System.out.println("Long");
    }
    public static void main(String[] args) {
        int x = 10;
        m1(x);
        /*
        widening followed by autoboxing is allowed in java, If it is overloaded methods.
         */
    }
}
