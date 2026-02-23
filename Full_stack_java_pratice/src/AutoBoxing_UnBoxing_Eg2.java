public class AutoBoxing_UnBoxing_Eg2 {

    // Here 10 is a primitive int literal.
    // But 'a' is declared as Integer (wrapper class).
    // So Java automatically converts (boxes) primitive int → Integer object.
    // This is called AUTOBOXING.
    static Integer a = 10;   // autoboxing (int → Integer)

    public static void main(String[] args) {

        // 'a' is an Integer object.
        // But 'a1' is primitive int.
        // So Java automatically converts (unboxes) Integer → int.
        // This is called AUTO-UNBOXING.
        int a1 = a;   // autounboxing (Integer → int)

        // Here we are passing a primitive int (a1) to method m1().
        // But m1() expects Integer object.
        // So Java automatically converts (boxes) int → Integer.
        // Again this is AUTOBOXING.
        m1(a1);   // autoboxing while passing argument
    }

    public static void m1(Integer i) {

        // Parameter 'i' is an Integer object.
        // 'k' is primitive int.
        // So Java converts Integer → int automatically.
        // This is AUTO-UNBOXING.
        int k = i;   // autounboxing

        System.out.println(k);  // prints 10
    }
}