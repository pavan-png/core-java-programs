public class For_Loop_Eg20 {
    public static void main(String[] args) {

        // Variable 'a' is declared and initialized before the loop
        int a = 0;

        // Variable 'b' is declared and initialized
        int b = 7;

        /*
         * ❌ INVALID for-loop form (commented in your code):
         *
         * for (a; a < b - 1; a = a + 2)
         *
         * Explanation:
         * - The first part of a for loop is called the INITIALIZATION PART.
         * - This part is executed only once.
         * - Java allows ONLY the following in this part:
         *     1) Variable declaration   → int x = 0;
         *     2) Statement expression   → x = 0, x++, ++x, methodCall()
         * - Writing just 'a' is:
         *     • not an assignment
         *     • not an increment
         *     • not a method call
         * - Therefore 'a' alone is NOT a valid statement expression.
         * - Hence the compiler throws an error.
         */

        /*
         * ✅ VALID approach:
         * - Initialization part is kept EMPTY.
         * - This is allowed because initialization is OPTIONAL in a for loop.
         * - Variable 'a' was already initialized above.
         * - The condition and update parts still control the loop.
         */
        for (; a < b - 1; a = a + 2) {

            // This statement prints the current value of 'a'
            // 'a' increases by 2 each iteration, so even numbers are printed
            System.out.println(a + " ");
        }

        /*
         * Loop terminates when the condition (a < b - 1) becomes false.
         * Control then exits the for loop normally.
         */
    }
}
