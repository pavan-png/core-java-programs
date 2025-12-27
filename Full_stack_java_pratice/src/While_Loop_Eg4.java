public class While_Loop_Eg4 {
    public static void main(String[] args) {

        // while loop with condition 'true'
        // This condition NEVER becomes false
        // So the loop runs forever
        while (true) {
            System.out.println("hello");
        }

        /*
         * System.out.println("hi");
         *
         * ❌ Compile-time error: unreachable statement
         *
         * Reason:
         * - Java compiler can clearly see that while(true) never terminates
         * - There is no break, return, or exception inside the loop
         * - So control can NEVER reach this statement
         * - Java does NOT allow code that can never execute
         */
    }
}
