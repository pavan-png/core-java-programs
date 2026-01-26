public class String_Eg109 {
    public static void main(String[] args) {

        /*
         * String literal "MISSS" is stored in the String Constant Pool.
         * String is immutable.
         */
        String place = "MISSS";

        /*
         * replace(String target, String replacement):
         * -------------------------------------------
         * - Replaces ALL NON-OVERLAPPING occurrences
         *   of the target string.
         * - Replacement happens from left to right.
         *
         * "MISSS"
         *   index: 0 1 2 3 4
         *          M I S S S
         *
         * First match of "SS" starts at index 2 → "SS"
         * Replace with "T"
         *
         * Result after first replacement:
         * "MIT S"
         *
         * Remaining string has no further
         * NON-OVERLAPPING "SS" patterns.
         */
        System.out.println(place.replace("SS", "T")); // Output: MITS
    }
}
