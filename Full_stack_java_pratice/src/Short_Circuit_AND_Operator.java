public class Short_Circuit_AND_Operator {
    public static synchronized void main(String[] args) {

        int x = 10, y = 15;

        /*
         * Condition:  ++x < 10  &&  ++y > 15
         *
         * Step 1: ++x < 10
         *         ++x increments x first → x becomes 11
         *         Now check: 11 < 10 → false
         *
         * IMPORTANT:
         * For the AND (&&) operator:
         *     If the LEFT condition is FALSE,
         *     The RIGHT condition is NOT evaluated.
         *
         * This is called SHORT-CIRCUIT behaviour.
         *
         * So ++y > 15 does NOT execute.
         * y stays 15 (no increment happens here).
         *
         * Since the entire condition is FALSE,
         * the if-block does NOT run.
         *
         * Therefore, the else-block executes:
         *     y++
         * y becomes 16.
         */

        if (++x < 10 && ++y > 15) {
            x++;   // This will NOT execute
        } else {
            y++;   // This WILL execute
        }

        // Final values after execution:
        System.out.println("x = " + x + "  " + "y = " + y);
    }
}
