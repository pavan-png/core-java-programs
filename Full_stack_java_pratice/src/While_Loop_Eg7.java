public class While_Loop_Eg7 {
    public static void main(String[] args) {

        // a and b are declared as final
        // Their values are CONSTANT and known at COMPILE TIME
        final int a = 20, b = 40;

        // while condition:
        // a < b is evaluated using compile-time constants
        // 20 < 40 is ALWAYS true
        // Compiler can guarantee this loop will NEVER terminate
        while (a < b) {

            // This statement will execute infinitely
            System.out.println("hello");
        }

        /*
         * System.out.println("hi");
         *
         * ❌ Compile-time error: unreachable statement
         *
         * Reason:
         * - a and b are final → values cannot change
         * - condition (a < b) is a compile-time constant expression
         * - compiler KNOWS the loop is infinite
         * - so any statement after the loop is unreachable
         */
    }
}
