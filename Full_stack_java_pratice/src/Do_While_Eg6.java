public class Do_While_Eg6 {
    public static void main(String[] args) {

        // do-while loop with a NORMAL BLOCK as body
        // The body executes FIRST, before checking the condition
        do {

            // This statement executes at least once
            // Since the condition is 'true', it keeps executing infinitely
            System.out.println("hello");

        }
        // Condition is checked AFTER executing the body
        // 'true' is a boolean literal known at compile time
        // This condition NEVER becomes false
        while (true);

        /*
         * System.out.println("hi");
         *
         * ❌ Compile-time error: unreachable statement
         *
         * Reason:
         * - The do-while loop condition is a constant 'true'
         * - The compiler KNOWS this loop will never terminate
         * - There is no break, return, or exception inside the loop
         * - Therefore, control can NEVER reach this statement
         * - Java compiler does not allow guaranteed unreachable code
         */
    }
}
