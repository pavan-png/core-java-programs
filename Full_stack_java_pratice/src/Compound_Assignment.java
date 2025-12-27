public class Compound_Assignment {
    public static void main(String[] args) {

        int a = 5;

        /*
         * Compound Assignment Operator:
         *
         * a += 10;
         *
         * This is a shorthand for:
         *     a = a + 10;
         *
         * Step-by-step:
         *     a = 5
         *     a + 10 = 15
         *     a becomes 15
         *
         * Compound assignment improves readability and avoids repeating
         * the variable name on both sides.
         */
        a += 10;

        System.out.println(a); // prints 15
    }
}
