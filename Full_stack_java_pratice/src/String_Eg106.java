public class String_Eg106 {
    public static void main(String[] args) {

        /*
         * String literal "ONE " (note the trailing space)
         * is stored in the String Constant Pool (SCP).
         */
        String text = "ONE ";

        /*
         * text.concat("ELEVEN "):
         * -----------------------
         * Creates a NEW String object with content:
         * "ONE ELEVEN "
         * (original 'text' is NOT modified)
         *
         * text.concat(text.concat("ELEVEN ")):
         * ------------------------------------
         * Inner concat produces "ONE ELEVEN "
         * Outer concat adds it to "ONE "
         * Result: "ONE ONE ELEVEN "
         *
         * trim():
         * -------
         * Removes leading and trailing spaces
         * from the resulting String.
         * Creates another NEW String object.
         */
        System.out.println(
                text.concat(text.concat("ELEVEN ")).trim()
        );

        /*
         * IMPORTANT:
         * String is immutable.
         * concat() and trim() return NEW String objects.
         *
         * The variable 'text' still refers to "ONE "
         * and remains unchanged.
         */
    }
}
