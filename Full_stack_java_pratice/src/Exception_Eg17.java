public class Exception_Eg17 {

    private static void m1() {

        // Step 1:
        // 1/0 causes ArithmeticException.
        // ArithmeticException is a subclass of RuntimeException.
        // RuntimeException is an UNCHECKED exception.
        // Unchecked exceptions are not checked by compiler.

        System.out.println(1 / 0);
    }

    public static void main(String[] args) {

        try {

            // Step 2:
            // Calling m1()
            // At runtime this will throw ArithmeticException.
            m1();

        } finally {

            // Step 4:
            // finally block ALWAYS executes,
            // even if exception occurs in try block.
            System.out.println("A");
        }

        /*
         Important Concept:

         There is NO catch block here.
         There is NO throws declaration.

         Why no compilation error?

         Because ArithmeticException is UNCHECKED.
         Compiler checks only CHECKED exceptions.

         For checked exceptions:
             - Must be handled (try-catch)
             OR
             - Must be declared using throws

         For unchecked exceptions:
             - No need to handle
             - No need to declare
         */
    }
}