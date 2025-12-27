public class Short_Circuit_OR_Operator_Eg2 {
    public static void main(String[] args) {
        /*
         * First condition:
         *     isItSmall(3) || isItSmall(7)
         *
         * Step 1 → isItSmall(3)
         *     3 < 5 → true
         *     Method prints: "i < 5"
         *     Returns true
         *
         * OR short-circuit rule:
         *     If LEFT side is TRUE → RIGHT side is NOT evaluated.
         *
         * So isItSmall(7) is SKIPPED completely.
         *
         * Since overall result is TRUE, "Result is true" is printed.
         */
        if (isItSmall(3) || isItSmall(7)) {
            System.out.println("Result is true");
        }

        /*
         * Second condition:
         *     isItSmall(6) || isItSmall(9)
         *
         * Step 1 → isItSmall(6)
         *     6 < 5 → false
         *     Method prints: "i >= 5"
         *     Returns false
         *
         * Because LEFT side is FALSE,
         * Java MUST evaluate the RIGHT side.
         *
         * Step 2 → isItSmall(9)
         *     9 < 5 → false
         *     Method prints: "i >= 5"
         *     Returns false
         *
         * Now the full OR condition:
         *     false || false → false
         *
         * Since the result is FALSE, the print statement inside the if-block
         * will NOT execute.
         */
        if (isItSmall(6) || isItSmall(9)) {
            System.out.println("Result is true"); // This will NOT run
        }
    }

    public static boolean isItSmall(int i) {

        // If number is < 5, print "i < 5" and return true
        if (i < 5) {
            System.out.println(" i < 5");
            return true;
        }
        // If number is >= 5, print "i >= 5" and return false
        else {
            System.out.println(" i >= 5");
            return false;
        }
    }
}
