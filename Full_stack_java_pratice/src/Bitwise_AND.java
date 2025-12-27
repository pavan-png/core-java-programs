public class Bitwise_AND {
    final strictfp public static void main(String[] args) {

        int x = 10, y = 15;

        /*
         * Condition:  ++x < 10  &  ++y > 15
         *
         * IMPORTANT:
         * (&) BITWISE AND does NOT short-circuit.
         * This means:
         *      Even if the LEFT condition is FALSE,
         *      The RIGHT condition WILL STILL RUN.
         *
         * This is the main difference from &&.
         *
         * -----------------------------------------------------------
         * STEP 1: Evaluate ++x < 10
         *         ++x increments x first → x becomes 11
         *
         *         Check: 11 < 10 → false
         *
         * Even though this is false,
         * because we used (&) instead of (&&),
         * Java MUST still evaluate the RIGHT side.
         * -----------------------------------------------------------
         *
         * -----------------------------------------------------------
         * STEP 2: Evaluate ++y > 15
         *         ++y increments y first → y becomes 16
         *
         *         Check: 16 > 15 → true
         * -----------------------------------------------------------
         *
         * Now the final condition becomes:
         *         false & true  → false
         *
         * Because the IF condition is false,
         * the ELSE-BLOCK runs:
         *         y++
         * y becomes 17.
         */

        if (++x < 10 & ++y > 15) {
            x++;   // will NOT run
        } else {
            y++;   // this WILL execute
        }

        // Final values after execution
        System.out.println("x = " + x + "  " + "y = " + y);
    }
}
