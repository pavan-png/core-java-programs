public class String_Eg108 {
    public static void main(String[] args) {

        /*
         * "Java" is a String literal.
         * It is stored in the String Constant Pool (SCP).
         */

        /*
         * "Java".replace('J','J')
         *
         * replace(char oldChar, char newChar):
         * -----------------------------------
         * - Checks whether replacement actually changes the content.
         * - Here oldChar and newChar are the SAME ('J').
         *
         * Since no change is needed:
         * - JVM returns the SAME String object ("Java")
         * - No new String object is created.
         */
        boolean flag1 = "Java" == "Java".replace('J','J');

        /*
         * Same operation again.
         * replace() again detects no change and returns
         * the same SCP reference.
         */
        boolean flag2 = "Java" == "Java".replace('J','J');

        /*
         * flag1 = true
         * flag2 = true
         *
         * true && true → true
         */
        System.out.println(flag1 && flag2); // true
    }
}
