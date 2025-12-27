public class Do_While_Eg3 {
    public static void main(String[] args) {

        /*
         * ❌ INVALID do-while loop:
         *
         * do
         *     while (true);
         *
         * Reason:
         * - In a do-while loop, the syntax is:
         *
         *   do {
         *       // body
         *   } while (condition);
         *
         * - The 'do' MUST be followed by a STATEMENT or a BLOCK.
         * - 'while(true);' by itself is a LOOP statement, not a valid body statement.
         * - Java does NOT allow another loop directly as the body of do-while without braces.
         *
         * Therefore, this causes a COMPILE-TIME ERROR.
         */

        /*
         * ✅ VALID forms:
         *
         * do {
         *     while (true) {
         *     }
         * } while (false);
         *
         * OR
         *
         * do {
         *     System.out.println("hello");
         * } while (true);
         */
    }
}
