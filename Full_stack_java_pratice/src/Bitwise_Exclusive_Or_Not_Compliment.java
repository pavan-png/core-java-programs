public class Bitwise_Exclusive_Or_Not_Compliment {
    public static void main(String[] args) {

        boolean b1  = true;
        boolean b2  = false;

        /*
         * EXPRESSION 1:
         *     !false ^ false
         *
         * Step 1: !false → true
         * Step 2: XOR operation:
         *
         *     true ^ false  → true
         *
         * XOR returns TRUE only when exactly ONE operand is true.
         */
        System.out.println(!false ^ false);   // prints true


        /*
         * EXPRESSION 2:
         *     !b1 & (b2 = true)
         *
         * Step 1: b1 = true
         *         !b1 → false
         *
         * Step 2: (b2 = true)
         *         Assignment operator = executes FIRST
         *         b2 becomes true
         *         The expression (b2 = true) RETURNS true
         *
         * Step 3: false & true
         *
         * NOTE:
         *     & does NOT short-circuit
         *     So RIGHT side ALWAYS executes.
         *
         * false & true → false
         */
        System.out.println(" " + (!b1 & (b2 = true)));  // prints false


        /*
         * EXPRESSION 3:
         *     b1 ^ b2
         *
         * Now b1 = true
         *      b2 = true (because previous expression assigned true)
         *
         * true ^ true → false
         *
         * XOR gives TRUE only when values differ.
         */
        System.out.println(" " + (b1 ^ b2)); // prints false


        /*
         * EXPRESSION 4:
         *     ~-25   (Bitwise NOT / bitwise complement)
         *
         * RULE:
         *     ~n = -(n + 1)
         *
         * So:
         *     ~(-25) = -(-25 + 1)
         *            = -( -24 )
         *            = 24
         */
        System.out.println(~-25);  // prints 24
        
    }
}
