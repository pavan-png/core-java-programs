public class String_Eg110 {
    public static void main(String[] args) {

        /*
         * String literal "PAVAN" is stored in the String Constant Pool.
         */
        String str = "PAVAN";

        /*
         * Expression breakdown:
         *
         * str.indexOf("A")
         * ----------------
         * Returns the index of the FIRST occurrence of "A".
         *
         * "PAVAN"
         *  0 1 2 3 4
         *  P A V A N
         *
         * indexOf("A") → 1
         *
         * str.indexOf("A") + 1
         * ---------------------
         * 1 + 1 = 2
         *
         * str.charAt(2)
         * -------------
         * Returns the character at index 2.
         * Character at index 2 is 'V'.
         */
        System.out.println(str.charAt(str.indexOf("A") + 1)); // Output: V
    }
}
