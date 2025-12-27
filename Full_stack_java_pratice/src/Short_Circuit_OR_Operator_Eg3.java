public class Short_Circuit_OR_Operator_Eg3 {
    public static void main(String[] args) {

        int a = 3;

        /*
         * First IF:
         * Condition: a++ == 3
         *
         * a++ returns OLD value 3 → then a becomes 4
         *
         * So 3 == 3 → true
         *
         * Therefore the IF block prints:
         *   "first condition is checked and then incremented"
         */
        if (a++ == 3) {
            System.out.println("first condition is checked and then incremented");
        }

        /*
         * Now a = 4
         *
         * Second print statement:
         *      a++ == 3  ||  --a == 3  &&  --a == 3
         *
         *********************************************************************
         * STEP 1: Evaluate a++ == 3
         *         a++ returns 4, then a becomes 5
         *
         *         4 == 3 → false
         *
         * Since LEFT side of OR (||) is FALSE,
         * we MUST evaluate the RIGHT side.
         *********************************************************************
         *
         * Expression now becomes:
         *      false || ( --a == 3 && --a == 3 )
         *
         *********************************************************************
         * STEP 2: In OR: false || (something)
         *         → must evaluate right side (no short-circuit)
         *
         * RIGHT SIDE is:
         *      --a == 3 && --a == 3
         *
         * CURRENT VALUE OF a = 5
         *
         *********************************************************************
         * STEP 3: Evaluate --a == 3   (left side of &&)
         *         --a → decrement first → a becomes 4
         *         Returns 4
         *
         *         4 == 3 → false
         *
         * IMPORTANT:
         * For && operator:
         *     If LEFT side is FALSE → RIGHT side is NOT evaluated
         *
         * Therefore:
         *     --a == 3  (the second one) is skipped.
         *
         * a remains 4 (NO second decrement)
         *
         *********************************************************************
         * Final evaluation:
         *
         *      a++ == 3          → false
         *      --a == 3 && ...   → false
         *
         * So:
         *      false || false → false
         *********************************************************************
         */
        System.out.println(a++ == 3 || --a == 3 && --a == 3);

        /*
         * After the print:
         * Last a++ was used in condition:
         *     a was 4 → printed false → then became 5
         *
         * So final value of a = 5
         */
        System.out.println(a);
    }
}
