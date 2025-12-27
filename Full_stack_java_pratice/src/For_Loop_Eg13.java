public class For_Loop_Eg13 {
    public static void main(String[] args) {

        // A label is given to the OUTER for loop
        // This label can be used by break to exit this outer loop directly
        label:
        for (int i = 0; i < 3; i++) {

            // Inner for loop starts for each value of i
            for (int j = 0; j < 3; j++) {

                // This condition checks if i and j are equal
                if (i == j)

                    // This is a LABELED break
                    // It does NOT break the inner loop
                    // It breaks the loop that has the label "label"
                    // That means the OUTER loop is terminated immediately
                    break label;

                // This statement would print the values of i and j
                // BUT it will never execute
                // because break label runs before this line
                System.out.println("i = " + i + "  j = " + j);
            }

            // Control never reaches here
            // because the outer loop is already broken
        }

        // Program ends here
        // No output is printed
    }
}
