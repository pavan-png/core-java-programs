public class Conversion_AutoBoxing {
    public static void m1(Object o){
        System.out.println("Object");
    }
    public  static void m1( Number n){
        System.out.println("Number");
    }
    public static void main(String[] args) {
        int x = 10;
        m1(x);    // AutoBoxing ====== int ====> Integer
                     // Widening   ====== NUmber, Object
    }
}
