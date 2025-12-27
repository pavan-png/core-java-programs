public class While_Loop_Eg8 {
    public static void main(String[] args) {

        // while loop with condition 'true'
        // 'true' is a boolean literal known at COMPILE TIME
        // The compiler knows this condition will NEVER become false
        while (true) {

            // This statement executes infinitely
            System.out.println("hello");
        }

        /*
         * System.out.println("hi");
         *
         * ❌ Compile-time error: unreachable statement
         *
         * Reason:
         * - The while condition is a constant 'true'
         * - The loop is guaranteed to be infinite
         * - There is no break, return, or exception inside the loop
         * - So control can NEVER reach this statement
         * - Java compiler rejects code that is guaranteed to never execute
         */
    }
}
