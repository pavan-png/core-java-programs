public class String_Eg100 {
    public static void main(String[] args) {

        /*
         * StringBuilder is created with initial content.
         * length = number of characters in the string
         * capacity >= length (implementation dependent)
         */
        StringBuilder sb = new StringBuilder("Hello pavan how are you");

        /*
         * delete(start, end):
         * - start index is inclusive
         * - end index is exclusive
         *
         * Here:
         * start = 0
         * end   = 100
         *
         * Since end index is greater than the current length,
         * StringBuilder treats end as length.
         *
         * Result:
         * All characters from index 0 to the end are deleted.
         * StringBuilder becomes empty.
         */
        sb.delete(0, 100);

        /*
         * After deletion:
         * - No characters are present
         * - length becomes 0
         * - capacity remains unchanged
         */
        System.out.println(sb.length()); // Output: 0
    }
}
