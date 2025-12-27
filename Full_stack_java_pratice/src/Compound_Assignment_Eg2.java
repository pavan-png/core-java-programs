public class Compound_Assignment_Eg2 {
    public static void main(String[] args) {

        int i = 10;
        int j = 20;

        /*
         * Expression:  k = (j += 10) / 5
         *
         * Step 1: j += 10
         *         This means: j = j + 10
         *         j = 20 + 10 = 30
         *
         * Step 2: Substitute the updated j value:
         *         k = 30 / 5
         *
         * Step 3: Perform division:
         *         k = 6
         *
         * Final values:
         *     i = 10  (unchanged)
         *     j = 30  (updated by compound assignment)
         *     k = 6   (result of expression)
         */
        int k = (j += 10) / 5;

        System.out.println("i : " + i + "  j : " + j + "  k : " + k);
    }
}
