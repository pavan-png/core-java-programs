public class Compound_Assignment_Eg3 {
    public static void main(String[] args) {

        // literal (number) increment is not possible. (Correct)
        int x = 5;

        /*
         * Statement:
         *      x *= 3*5 + 7*x - 1 + ++x;
         *
         * RULE:
         * In compound assignment (x *= expr):
         *   Step 1 → evaluate the entire RIGHT-HAND SIDE first, using the CURRENT x values.
         *   Step 2 → multiply original x with the result of RHS.
         *   Step 3 → assign it back to x.
         *
         * IMPORTANT:
         *    Unary operators in the RHS WILL affect the value of x BEFORE the *= assignment happens.
         *    The comment you wrote saying “x remains original irrespective of changes” is WRONG.
         *
         * Let's evaluate RHS step-by-step:
         *
         * Initial x = 5
         *
         * RHS: 3*5 + 7*x - 1 + ++x
         *
         * Step 1: 3*5 = 15
         *
         * Step 2: 7*x = 7*5 = 35   (x is still 5 here)
         *
         * Step 3: -1 remains -1
         *
         * Step 4: ++x increments x → x becomes 6 and returns 6
         *
         * Now RHS = 15 + 35 - 1 + 6 = 55
         *
         * After RHS evaluation:
         *    x is now 6 (because of ++x)
         *
         * Now LHS evaluation:
         *    x *= 55  →  x = x * 55
         *
         * But IMPORTANT:
         *    x is NOW 6, NOT the original 5.
         *
         * So:
         *    x = 6 * 55 = 330
         */
        x *= 3*5 + 7*x - 1 + ++x;

        System.out.println(x);   // prints 330


        /*
         * Expression:
         *     int y = x+++1;
         *
         * This is parsed as:
         *     y = x++ + 1;
         *
         * Because x++ is post-increment.
         *
         * Step-by-step (current x = 330):
         *
         * x++ returns 330, then x becomes 331
         *
         * y = 330 + 1 = 331
         */
        int y = x++ + 1;

        System.out.println(x);  // x is now 331
    }
}
