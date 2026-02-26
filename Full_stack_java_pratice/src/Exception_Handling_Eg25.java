public class Exception_Handling_Eg25 {

    public static void main(String[] args) {

        // Step 1:
        // If we call m1() here,
        // compiler will check its throws declaration.

        // m1();   // ❌ Compile-time error (if uncommented)

        /*
         Why compile-time error?

         Because m1() declares:
             throws Exception   (checked exception)

         So main() must either:
             ✔ handle it using try-catch
             OR
             ✔ declare it using throws

         Since main() does neither,
         compiler reports:
             "Unhandled exception type Exception"
        */
    }

    /*
     Step 2:
     This method declares a checked exception.

     Even though inside the method we are NOT actually
     throwing any exception,
     the declaration "throws Exception" is enough
     for the compiler to enforce handling at call site.
    */

    private static void m1() throws Exception {   // Line 6

        // Step 3:
        // This line does NOT throw any exception.
        // But since method signature declares "throws Exception",
        // caller must treat it as if it may throw one.
        System.out.println("NOT THROWING ANY EXCEPTION");
    }

}