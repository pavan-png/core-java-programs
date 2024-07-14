public class AutoBoxing_Vs_UnBoxing {
    public static void m1(Long l){
        System.out.println("Long");
    }
    public static void main(String[] args) {
        int x = 10;
     //   m1(x);   compile time error
        //  int ====> AutoBoxing  =======> Integer
        //            widening   =========> Number, Object

    }
}
