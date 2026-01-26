public class String_Eg105 {
    public static void main(String[] args) {

        /*
         * String literal "SCP" is stored in the String Constant Pool.
         */
        String s1 = "SCP";

        /*
         * String literal "scp" is also stored in the String Constant Pool.
         * Note: Case difference means a DIFFERENT String object.
         */
        String s2 = "scp";

        /*
         * length() returns the number of characters.
         * Case does NOT affect length.
         *
         * "SCP" → 3 characters
         * "scp" → 3 characters
         * Since length() returns a primitive int, == compares values.
           When == is used with objects (like String), it compares references, not content.
         */
        System.out.println(s1.length() == s2.length()); // true

        /*
         * equalsIgnoreCase():
         * - Compares content
         * - Ignores character case (upper/lower)
         *
         * "SCP" and "scp" have the same letters
         * when case is ignored.
         */
        System.out.println(s1.equalsIgnoreCase(s2)); // true
    }
}
