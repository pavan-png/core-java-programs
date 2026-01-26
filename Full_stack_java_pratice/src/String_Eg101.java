public class String_Eg101 {
    public static void main(String[] args) {

        /*
         * StringBuilder is created with an initial capacity of 100.
         * Capacity = total number of characters that can be stored
         * without resizing.
         *
         * No characters are added, so the content is empty.
         */
        StringBuilder sb = new StringBuilder(100);

        /*
         * sb.length():
         * - Returns the number of characters currently stored.
         * - Since nothing is appended, length is 0.
         *
         * sb.toString():
         * - Converts the StringBuilder content to a new String.
         * - The content is empty, so the String length is also 0.
         */
        System.out.println(sb.length() + " : " + sb.toString().length());
        // Output: 0 : 0
    }
}
