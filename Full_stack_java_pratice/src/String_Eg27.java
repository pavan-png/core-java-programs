public class String_Eg27 {
    public static void main(String[] args) {

        // 's' is a final reference variable of type StringBuffer
        // final means: the reference cannot point to another object
        final StringBuffer s = new StringBuffer("Hello");

        // StringBuffer is mutable
        // append() changes the content of the SAME object
        // No new object is created here
        s.append("pavan");

        // Prints the modified content of the same StringBuffer object
        System.out.println(s);   // Hello pavan

        /*
         * s = new StringBuffer("someone");
         *
         * This is NOT allowed because 's' is final.
         * final prevents reassignment of the reference.
         *
         * Important:
         * - final does NOT make the object immutable
         * - The object can still be modified
         * - Only the reference is fixed
         *
         * So:
         * - Operations like append(), delete(), insert() are allowed
         * - Reassigning 's' to a new object is NOT allowed
         */
    }
}
