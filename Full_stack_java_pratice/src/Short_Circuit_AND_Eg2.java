public class Short_Circuit_AND_Eg2 {
    public static void main(String[] args) {

        int x = 10;

        /*
         * Condition:  ++x < 10  &&  ((x / 0) > 10)
         *
         * STEP 1: Evaluate ++x < 10
         *         ++x increments x first → x becomes 11
         *
         *         Check condition:
         *         11 < 10 → false
         *
         * IMPORTANT:
         * For the AND (&&) operator:
         *     If the LEFT side is FALSE,
         *     The RIGHT side is NOT evaluated.
         *
         * This is SHORT-CIRCUIT behavior.
         *
         * Therefore, ((x/0) > 10) does NOT execute.
         *
         * This is very important because:
         *     (x / 0) would normally cause ArithmeticException (division by zero).
         *
         * But because of short-circuiting, Java NEVER reaches this part.
         * No error is thrown.
         *
         * Since the condition is FALSE,
         * The else-block executes.
         */

        if (++x < 10 && ((x / 0) > 10)) {
            System.out.println("hello");   // This will NOT run
        } else {
            System.out.println("Hi");      // This WILL run
        }
    }
}
