public class While_Loop_Eg5 {
    public static void main(String[] args) {

        /*
         * ❌ INVALID code:
         *
         * while (false) {
         *     System.out.println("hello");
         * }
         *
         * Compile-time error: unreachable statement
         *
         * Reason:
         * - 'false' is a boolean literal
         * - Its value is known at compile time
         * - The while condition is NEVER true
         * - So the loop body can NEVER execute
         * - Java compiler does NOT allow code that will never run
         */

        // This statement is valid and will execute normally
        System.out.println("hi");
    }
}
