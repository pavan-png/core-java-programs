public class Compound_Assignment_Eg4 {
    public static void main(String[] args) {

        int a = 10;

        /*
         * Expression:
         *     a *= 10 + 3*4 - --a + a-- + ++a;
         *
         * IMPORTANT RULE:
         * For compound assignment (a *= expr):
         *   1) Evaluate the ENTIRE RHS first.
         *   2) All unary ++ / -- inside RHS DO affect the variable immediately.
         *      (NOT the “original value only” as your comment said. That is incorrect.)
         *   3) After RHS is finished, evaluate:
         *           a = a * RHS
         *
         * -----------------------------------------------------------
         * STEP 1: Evaluate RHS using operator precedence.
         * -----------------------------------------------------------
         * PRECEDENCE ORDER:
         *   1) ++ / -- (unary)
         *   2) * , /
         *   3) + , -
         *
         * Start with a = 10
         *
         * RHS: 10 + 3*4 - --a + a-- + ++a
         *
         * ---------------------------------------
         * PART 1: 3*4 = 12
         *
         * RHS becomes:
         *     10 + 12 - --a + a-- + ++a
         *
         * ---------------------------------------
         * PART 2: --a   (pre-decrement)
         *     a = 10 → 9
         *     returns 9
         *
         * RHS:
         *     10 + 12 - 9 + a-- + ++a
         *
         * ---------------------------------------
         * PART 3: a--   (post-decrement)
         *     returns 9
         *     then a becomes 8
         *
         * RHS:
         *     10 + 12 - 9 + 9 + ++a
         *
         * ---------------------------------------
         * PART 4: ++a   (pre-increment)
         *     a = 8 → 9
         *     returns 9
         *
         * Now RHS = 10 + 12 - 9 + 9 + 9
         *
         * Compute step-by-step:
         *   10 + 12 = 22
         *   22 - 9 = 13
         *   13 + 9 = 22
         *   22 + 9 = 31
         *
         * FINAL RHS = 31
         *
         * At this point, a = 9 (after all increments/decrements)
         *
         * -----------------------------------------------------------
         * STEP 2: Apply compound assignment
         * -----------------------------------------------------------
         * a *= 31
         *
         * Meaning:
         *     a = a * 31
         *
         * a = 9 * 31 = 279
         */

        a *= 10 + 3*4 - --a + a-- + ++a;

        System.out.println(a);  // prints 279
    }
}
