public class Do_While_Eg10 {
    public static void main(String[] args) {

        // a and b are declared as final
        // Their values are CONSTANT and known at COMPILE TIME
        final int a = 10, b = 20;

        // do-while loop starts
        // Body executes FIRST (at least once)
        do {

            // This statement executes at least once
            System.out.println("hello");

        }
        // Condition is checked AFTER executing the body
        // a < b → 10 < 20 → true
        // Since a and b are final, the compiler knows this is ALWAYS true
        while (a < b);

        /*
         * System.out.println("hello");
         *
         * ❌ Compile-time error: unreachable statement
         *
         * Reason:
         * - a and b are final, so their values cannot change
         * - The condition (a < b) is a compile-time constant expression
         * - Compiler knows the loop is INFINITE
         * - Therefore, any statement written after the loop
         *   can NEVER be executed
         * - Java compiler rejects guaranteed unreachable code
         */
    }
}
