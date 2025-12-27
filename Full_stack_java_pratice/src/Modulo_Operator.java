public class Modulo_Operator {
    public static void main(String[] args) {

        int x = 5;
        int y = 7;

        /*
         * Expression: ( (y * 2) % x )
         *
         * Step 1: y * 2 = 7 * 2 = 14
         * Step 2: 14 % 5
         *
         * Modulo (%) gives the remainder after division.
         *
         * 5 goes into 14 two times (5 × 2 = 10)
         * Remainder = 14 - 10 = 4
         *
         * So this prints: 4
         */
        System.out.println(((y * 2) % x));

        /*
         * Expression: y % x → 7 % 5
         *
         * 5 goes into 7 one time (5 × 1 = 5)
         * Remainder = 7 - 5 = 2
         *
         * So this prints: 2
         */
        System.out.println(" " + (y % x));
    }
}
