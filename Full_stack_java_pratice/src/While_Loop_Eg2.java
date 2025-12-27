public class While_Loop_Eg2 {
    public static void main(String[] args) {

        /*
         * ❌ INVALID while loop:
         *
         * while (1) {
         *     System.out.println("infinite loop");
         * }
         *
         * Explanation:
         * - The condition of a while loop MUST be a boolean expression.
         * - In Java, '1' is an int literal, NOT a boolean.
         * - Java does NOT convert int values to boolean values.
         * - Therefore, using '1' as a condition causes a compile-time error.
         */

        /*
         * ✅ VALID forms:
         *
         * while (true)  { }    // boolean literal
         * while (false) { }    // boolean literal
         * while (i < 10) { }   // boolean expression
         */
    }
}
