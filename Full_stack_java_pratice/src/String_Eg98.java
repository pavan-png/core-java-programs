public class String_Eg98 {

    // Instance variable declaration (default value is null)
    StringBuilder sb1;

    public static void main(String[] args) {

        // Creating a StringBuilder object (EMPTY but NOT null)
        StringBuilder sb = new StringBuilder();

        /*
         * append("") adds an empty string
         * It does NOT add any characters
         * So length remains 0
         */
        System.out.println(
                sb.append("")
                        .append("")
                        .append("")
                        .append("")
                        .length()
        ); // Output: 0

        /*
         * NullPointerException occurs when:
         * - reference exists
         * - but it points to NO object
         * - and we try to call a method on it
         */

        // Creating object of String_Eg98
        String_Eg98 obj = new String_Eg98();

        /*
         * obj.sb1 is an instance variable
         * JVM initializes it to null by default
         * No StringBuilder object is created for sb1
         *
         * Calling equals() on a null reference
         * leads to NullPointerException
         */
        obj.sb1.equals(sb); // Runtime Exception
    }
}
