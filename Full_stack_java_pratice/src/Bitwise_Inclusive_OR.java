public class Bitwise_Inclusive_OR {
    final strictfp public static void main(String[] args) {

        int x = 10, y = 15;

        /*
         * Condition:  ++x < 10  |  ++y > 15
         *
         * IMPORTANT:
         * Bitwise Inclusive OR ( | ) does NOT short-circuit.
         * This means:
         *      Both the LEFT and RIGHT conditions WILL be evaluated,
         *      regardless of the left condition's result.
         *
         * -----------------------------------------------------------
         * STEP 1: Evaluate ++x < 10
         *         ++x increments x first → x becomes 11
         *
         *         Check: 11 < 10 → false
         * -----------------------------------------------------------
         *
         * Even though LEFT condition is false,
         * because of bitwise OR ( | ), the RIGHT condition MUST run.
         *
         * -----------------------------------------------------------
         * STEP 2: Evaluate ++y > 15
         *         ++y increments y first → y becomes 16
         *
         *         Check: 16 > 15 → true
         * -----------------------------------------------------------
         *
         * Final condition:
         *          false | true → true
         *
         * Because OR gives true when ANY one condition is true.
         *
         * Since the IF condition is TRUE:
         *      x++
         *
         * x becomes 12.
         *
         * The else-block does NOT execute.
         */

        if (++x < 10 | ++y > 15) {
            x++;   // This WILL execute
        } else {
            y++;   // This will NOT execute
        }

        // Final values after execution:
        System.out.println("x = " + x + "  " + "y = " + y);
    }
}
