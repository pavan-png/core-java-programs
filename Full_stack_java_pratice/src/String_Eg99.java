public class String_Eg99 {
    public static void main(String[] args) {

        /*
         * StringBuilder is created with initial capacity = 5
         * Capacity means how many characters it can hold
         * without resizing.
         */
        StringBuilder sb = new StringBuilder(5);

        /*
         * We are appending 10 characters.
         * Current capacity (5) is not enough.
         *
         * New capacity formula used by StringBuilder:
         * newCapacity = (oldCapacity * 2) + 2
         *
         * oldCapacity = 5
         * newCapacity = (5 * 2) + 2 = 12
         */
        sb.append("0123456789");

        // Prints the current capacity after resizing
        System.out.println(sb.capacity()); // 12

        /*
         * delete(start, end):
         * - Deletes characters from index start (inclusive)
         * - to index end (exclusive)
         *
         * Here:
         * start = 8
         * end   = 1000
         *
         * String length is only 10
         * Valid indexes: 0 to 9
         *
         * Characters at index 8 and 9 will be deleted
         * end index beyond length is safely ignored
         * No exception is thrown
         */
        sb.delete(8, 1000);

        // Remaining content after deletion
        System.out.println(sb); // 01234567
    }
}
