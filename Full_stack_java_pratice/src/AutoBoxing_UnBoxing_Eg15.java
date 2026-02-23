public class AutoBoxing_UnBoxing_Eg15 {

    // Method 1: accepts Short wrapper
    public static void go(Short s){
        System.out.println("Short");
    }

    // Method 2: accepts Integer wrapper
    public static void go(Integer i){
        System.out.println("int");
    }

    // Method 3: accepts Long wrapper
    public static void go(Long l){
        System.out.println("Long");
    }

    public static void main(String[] args) {

        short x = 10;
        long y = 5;

        /*
         Call 1: go(x)

         x is primitive short.

         Available methods:
             go(Short)
             go(Integer)
             go(Long)

         There is NO method that takes primitive short.

         So compiler checks:

         1️⃣ Is primitive widening possible?
             short → int → long → float → double
             But no primitive methods exist.

         2️⃣ Then checks autoboxing:
             short → Short  ✅ exact wrapper match

         So go(Short) is selected.
        */
        go(x);   // prints "Short"



        /*
         Call 2: go(y)

         y is primitive long.

         Available methods:
             go(Short)
             go(Integer)
             go(Long)

         No primitive long method exists.

         So compiler checks:

         1️⃣ Widening?
             long → float → double
             But no such primitive method available.

         2️⃣ Autoboxing:
             long → Long  ✅ exact wrapper match

         So go(Long) is selected.
        */
        go(y);   // prints "Long"
    }
}