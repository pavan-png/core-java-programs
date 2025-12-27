public class Short_Circuit_OR_Operator {
    public static synchronized void main(String[] args) {

        int x = 10, y = 15;

        /*
         * Condition:  ++x < 10  ||  ++y > 15
         *
         * STEP 1: Evaluate ++x < 10
         *         ++x increments x first → x becomes 11
         *
         *         Check condition:
         *         11 < 10 → false
         *
         * IMPORTANT:
         * In OR (||) operator:
         *      If the LEFT side is FALSE,
         *      The RIGHT side MUST be evaluated.
         *
         * So now Java will evaluate the second condition.
         *
         * STEP 2: Evaluate ++y > 15
         *         ++y increments y first → y becomes 16
         *
         *         Check condition:
         *         16 > 15 → true
         *
         * FINAL RESULT OF IF CONDITION:
         *         false || true → true
         *
         * Since the overall condition is TRUE,
         * the IF-BLOCK executes:
         *         x++
         * x becomes 12.
         *
         * The ELSE-BLOCK is skipped.
         */

        if (++x < 10 || ++y > 15) {
            x++;   // This WILL execute
        } else {
            y++;   // This will NOT execute
        }

        System.out.println("x = " + x + "  " + "y = " + y);
    }
}
