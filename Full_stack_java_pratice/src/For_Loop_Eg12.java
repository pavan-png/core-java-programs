public class For_Loop_Eg12 {
    public static void main(String[] args) {

        // Label is applied to the OUTER for loop
        label:
        for (int i = 0; i < 3; i++) {

            // Inner for loop starts for each value of i
            for (int j = 0; j < 3; j++) {

                // If i and j are equal
                if (i == j)

                    // This is an UNLABELED break
                    // So it breaks ONLY the NEAREST loop,
                    // which is the INNER for loop (j loop)
                    break;

               // break stops the entire loop immediately.
               // It does NOT just skip one value.

                // This line executes only when i != j
                System.out.println("i = " + i + "  j = " + j);
            }

            // After inner loop breaks, control comes here
            // Then outer loop continues with next value of i
        }
    }
}
