public class String_Eg147 {

    // Static String variable
    // Initialized with empty String
    static String o = "";

    public static void main(String[] args) {

        // ❌ Invalid usage of label
        // A label CANNOT be applied to an assignment statement
        // Labels can be used ONLY with loops or switch statements
        // z: o = o + 2;   // compile-time error


        // for loop starts with x = 3 and runs while x < 8
        for (int x = 3; x < 8; x++) {

            // When x becomes 4
            // break terminates the loop immediately
            if (x == 4)
                break;

            // This condition is NEVER reached
            // because loop already breaks at x == 4
            if (x == 6)
                // break z;  // ❌ compile-time error
                // Label 'z' does not exist
                // And even if it existed, it must be attached to a loop

                // String is immutable
                // o = o + x creates a NEW String object
                // The result is reassigned to o
                o = o + x;

            // Prints the current value of o
            System.out.println(o);

            /*
             Execution flow:
             x = 3 → o = "" + 3 → "3" → printed
             x = 4 → break → loop exits
            */
        }
    }
}
