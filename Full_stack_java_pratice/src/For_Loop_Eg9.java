public class For_Loop_Eg9 {
    public static void main(String[] args) {

        int a = 10, b = 20;

        /*
         for-loop condition:
         -------------------
         a < b

         IMPORTANT POINT:
         ----------------
         Here, the condition uses VARIABLES (a and b),
         not boolean literals.

         Because variables are involved:
         - The compiler CANNOT decide the result at compile time.
         - The condition is evaluated at RUNTIME by the JVM.

         Even though a < b is true with current values,
         the compiler does NOT assume it will always be true.
        */
        for (int i = 0; a < b; i++) {

            /*
             Since the compiler cannot guarantee
             that this loop is infinite,
             the loop body is considered REACHABLE.

             So there is NO compile-time error.
            */
            System.out.println("hello");
        }

        /*
         This statement is also considered REACHABLE
         because the compiler does not know whether
         the loop will terminate or not at runtime.
        */
        System.out.println("hi");
    }
}
