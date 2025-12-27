public class Bitwise_Exclusive_Or {
    public static void main(String[] args) {

        int a = 5;
        int b = 6;

        /*
         * Operator used:  ^   (Bitwise Exclusive OR)
         *
         * IMPORTANT RULE:
         * For boolean expressions:
         *       true  ^  true   → false
         *       true  ^  false  → true
         *       false ^  true   → true
         *       false ^  false  → false
         *
         * XOR returns TRUE only when exactly ONE condition is TRUE.
         *
         * Also:  ^ DOES NOT short-circuit.
         *        So both expressions WILL be evaluated.
         *
         * ---------------------------------------------------------------
         * Evaluate LEFT condition:  a++ > 4
         *
         * a++ returns 5 (old value), then a becomes 6
         * 5 > 4 → true
         *
         * Current a = 6
         * ---------------------------------------------------------------
         *
         * Evaluate RIGHT condition: b++ > 6
         *
         * b++ returns 6 (old value), then b becomes 7
         * 6 > 6 → false
         *
         * Current b = 7
         * ---------------------------------------------------------------
         *
         * Final XOR evaluation:
         *      true  ^  false  → true
         *
         * So IF block executes.
         */

        if ((a++ > 4) ^ (b++ > 6)) {
            System.out.println(a);   // a = 6
            System.out.println(b);   // b = 7
        } else {
            System.out.println("hi");
        }
    }
}
