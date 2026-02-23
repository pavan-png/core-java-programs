interface Foo {}

// Alpha implements Foo
class Aplha implements Foo {}

// Beta_0 extends Alpha
// So hierarchy is:
//
// Foo (interface)
//     ↑
// Aplha
//     ↑
// Beta_0
//
class Beta_0 extends Aplha {}


// AutoBoxing_UnBoxing_Eg10 extends Beta_0
// So final hierarchy:
//
// Foo
//   ↑
// Aplha
//   ↑
// Beta_0
//   ↑
// AutoBoxing_UnBoxing_Eg10
//
public class AutoBoxing_UnBoxing_Eg10 extends Beta_0 {

    public static void main(String[] args) {

        // Object created of type Beta_0
        Beta_0 x = new Beta_0();

        // Upcasting (implicit)
        // Child object can be stored in parent reference.
        // No cast required.
        Aplha a = x;
        // Beta_0 IS-A Aplha → valid


        /*
         Here we are forcing cast to AutoBoxing_UnBoxing_Eg10.
         But x actually refers to Beta_0 object.

         Important:
         Beta_0 is parent class of AutoBoxing_UnBoxing_Eg10.
         You cannot convert parent object into child type.

         At compile time → allowed (because of casting).
         At runtime → ClassCastException.
        */
        Foo f = (AutoBoxing_UnBoxing_Eg10) x;   // 💥 Runtime error


        // This is safe.
        // x is Beta_0 object.
        // Beta_0 extends Aplha.
        // Aplha implements Foo.
        // So Beta_0 IS-A Foo.
        Foo f1 = (Aplha) x;   // valid (upcasting through parent)


        // (Aplha)x → still refers to same Beta_0 object.
        // Then cast back to Beta_0 → valid.
        Beta_0 b = (Beta_0) (Aplha) x;   // valid


        // Creating object of AutoBoxing_UnBoxing_Eg10.
        // It extends Beta_0 → Aplha → Foo.
        // So it IS-A Foo.
        Foo f5 = new AutoBoxing_UnBoxing_Eg10();   // valid
    }
}