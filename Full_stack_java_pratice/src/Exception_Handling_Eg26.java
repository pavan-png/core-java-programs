public class Exception_Handling_Eg26 {

    /*
     Step 1:
     Static block executes when the class is loaded.
     Class loading happens BEFORE main() method runs.
    */
    static {

        /*
         Step 2:
         1 / 0 causes ArithmeticException (unchecked).

         Since this exception occurs inside a static block,
         JVM cannot allow normal execution.

         So JVM wraps the original exception
         inside ExceptionInInitializerError.
        */
        System.out.println(1 / 0);
    }

    public static void main(String[] args) {

        /*
         Step 5:
         This line will NEVER execute,
         because class initialization fails
         before main() starts.
        */
        System.out.println("hello");
    }
}