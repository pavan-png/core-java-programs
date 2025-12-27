public class ForLoop_Eg21 {

    // Static variable declared at class level
    // It can be accessed inside static methods
    static String s = "";

    public static void main(String[] args) {

        // Label 'z' is applied to the for loop
        z:
        for (int i = 2; i < 7; i++) {

            // When i becomes 3
            if (i == 3)
                // Unlabeled continue:
                // skips ONLY the current iteration
                // control goes to the update part of the loop (i++)
                continue;

            // When i becomes 5
            if (i == 5)
                // Labeled break:
                // breaks the loop that has label 'z'
                // loop terminates immediately
                break z;

            // This line executes only when:
            // i is NOT 3 (not skipped by continue)
            // i is NOT 5 (loop not broken yet)

            // Static variable 's' is accessed inside static method
            // String + int results in String concatenation
            s = s + i;
        }

        // After loop termination, final value of 's' is printed
        System.out.println(s);

        // Static variable access is allowed inside static method
    }
}
