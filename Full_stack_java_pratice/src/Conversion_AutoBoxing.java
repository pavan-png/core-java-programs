public class Conversion_AutoBoxing {

    // Method 1: takes Object (super class of all classes)
    public static void m1(Object o){
        System.out.println("Object");
    }

    // Method 2: takes Number (super class of wrapper classes)
    public static void m1(Number n){
        System.out.println("Number");
    }

    // Method 3: takes Long wrapper
    public static void m1(Long l){
        System.out.println("Long");
    }

    public static void main(String[] args) {

        int x = 10;   // primitive int

        /*
         x is primitive int.

         Step 1: int → Integer  (Autoboxing)
         Step 2: Integer is a subclass of Number
                 Number is a subclass of Object

         Now Java checks the most specific method.

         Possible matches:
         m1(Object)   → valid
         m1(Number)   → valid
         m1(Long)     → NOT valid (Integer cannot become Long)

         Among Object and Number,
         Number is more specific.

         So m1(Number) is selected.
         */

        m1(x);   // Output: Number

        /*
         Important Note:

         Widening + Boxing is NOT allowed:
         int → long → Long   ❌

         But Boxing + Widening Reference is allowed:
         int → Integer → Number → Object   ✅
         */
    }
}