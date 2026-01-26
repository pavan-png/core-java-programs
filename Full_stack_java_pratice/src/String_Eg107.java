public class String_Eg107 {
    public static void main(String[] args) {

        /*
         * String literal "PANIC" is stored in the String Constant Pool.
         * String is immutable.
         */
        String str = "PANIC";

        /*
         * StringBuilder object is created with content "THET".
         * StringBuilder is mutable.
         */
        StringBuilder sb = new StringBuilder("THET");

        /*
         * str.replace("N", sb)
         *
         * replace(CharSequence target, CharSequence replacement):
         * --------------------------------------------------------
         * - "N" is a String → implements CharSequence
         * - StringBuilder also implements CharSequence
         *
         * What happens internally:
         * - 'N' in "PANIC" is replaced with sb.toString()
         * - A NEW String object is created
         * - Original String 'str' remains unchanged
         *
         * Result:
         * "PANIC" → "PATHETIC"
         */
        System.out.println(str.replace("N", sb));

        /*
         * NOTE:
         * Even though sb is StringBuilder,
         * replace() converts it to characters (CharSequence).
         * The returned object is ALWAYS a String.
         */
    }
}
