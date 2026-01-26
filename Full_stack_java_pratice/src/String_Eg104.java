public class String_Eg104 {
    public static void main(String[] args) {

        /*
         * StringBuilder object is created with initial content "SpaceStation".
         * StringBuilder is mutable.
         */
        StringBuilder sb = new StringBuilder("SpaceStation");

        /*
         * Method chaining explanation:
         *
         * sb.delete(5, 6)
         * ----------------
         * Deletes character at index 5 (exclusive of 6).
         * "SpaceStation" → removes 'S'
         * Result: "Space tation"
         *
         * .insert(5, " S")
         * ----------------
         * Inserts " S" at index 5.
         * Result: "Space Station"
         *
         * .toString()
         * ------------
         * Converts StringBuilder content to a NEW String object.
         * From this point onwards, the result is a String (immutable).
         *
         * .toUpperCase()
         * ---------------
         * Creates a NEW String object in uppercase.
         * DOES NOT modify the StringBuilder.
         *
         * IMPORTANT:
         * The result of toUpperCase() is NOT stored anywhere.
         */
        sb.delete(5, 6)
                .insert(5, " S")
                .toString()
                .toUpperCase();

        /*
         * sb still refers to the StringBuilder object.
         * Only delete() and insert() affected sb.
         * toUpperCase() worked on a String and was ignored.
         */
        System.out.println(sb); // Output: Space Station
    }
}
