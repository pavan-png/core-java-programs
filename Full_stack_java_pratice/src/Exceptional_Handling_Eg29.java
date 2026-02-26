public class Exceptional_Handling_Eg29 {

    public static void main(String[] args) {

        // Step 1:
        // Creating object of Error class.
        Error obj = new Error();

        /*
         instanceof operator rules:

         At compile time:
         There must be some inheritance relationship
         between reference type and the type we are checking.

         Otherwise → Compile-time error.
        */

        /*
        // ❌ Compile-time error

        boolean flag1 = obj instanceof RuntimeException;

        Reason:
        RuntimeException and Error are siblings.
        Both are subclasses of Throwable,
        but they are NOT parent-child of each other.

        So compiler says:
        "Incompatible conditional operand types"


        boolean flag2 = obj instanceof Exception;

        Reason:
        Exception and Error are also siblings.
        No direct parent-child relation.
        So compile-time error.
        */

        // ✔ Valid
        // obj is of type Error.
        // Checking against same type → allowed.
        boolean flag3 = obj instanceof Error;

        // ✔ Valid
        // Error is subclass of Throwable.
        // So checking against parent class is allowed.
        boolean flag4 = obj instanceof Throwable;

        // Printing results
        System.out.println(" : " + flag3 + " : " + flag4);

        /*
         Output:
             : true : true

         Because:
             obj is an Error object
             Error IS-A Throwable
        */


        /*
         ----------------------------------------------
         Special instanceof rules with unrelated types
         ----------------------------------------------

         String s = "Hello";

         System.out.println(s instanceof StringBuffer);

         ❌ Compile-time error

         Reason:
         String and StringBuffer are unrelated classes.
         No inheritance relationship.
         So compiler rejects it.
        */


        /*
         System.out.println(s instanceof Runnable);

         ✔ Compiles

         Why?

         Because Runnable is an interface.

         When checking with interface type,
         compiler allows it even if there is no
         direct relationship at compile time.

         At runtime:
             If object implements Runnable → true
             Otherwise → false

         So no compile-time error here.
        */
    }
}