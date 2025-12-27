public class For_Loop_Eg22 {
    public static void main(String[] args) {

        // Label given to the OUTER for loop
        // Label name can be anything (here it is 'foreach')
        foreach:
        for (int j = 0; j < 5; j++) {

            // Inner loop runs for each value of j
            for (int k = 0; k < 3; k++) {

                // Prints the current value of j
                // This executes before any break condition
                System.out.print("" + j);

                // When j is 3 and k is 1
                if (j == 3 && k == 1)

                    // Labeled break
                    // This breaks the loop with label 'foreach'
                    // i.e., the OUTER loop
                    // Both loops terminate immediately
                    break foreach;

                // When j is 0 OR j is 2
                if (j == 0 || j == 2)

                    // Unlabeled break
                    // This breaks ONLY the INNER loop
                    // Control goes back to the outer loop
                    break;
            }

            // After inner loop breaks (normally),
            // outer loop continues with next value of j
        }

        // Program ends here after loops are terminated
    }
}
