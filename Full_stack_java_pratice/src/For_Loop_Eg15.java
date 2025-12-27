public class For_Loop_Eg15 {
    public static void main(String[] args) {

        // A label is given to the OUTER loop
        // This label allows inner code to directly control the outer loop
        label:
        for (int i = 0; i < 3; i++) {

            // Inner loop starts for each value of i
            for (int j = 0; j < 3; j++) {

                // When i and j are equal, this condition becomes true
                if (i == j)

                    // This is a LABELED continue
                    // It does NOT continue the inner loop
                    // Instead, it skips the CURRENT iteration of the OUTER loop
                    // Control jumps to the update part of the OUTER loop (i++)
                    continue label;

                // This statement executes ONLY when i != j
                // But in this program, it rarely executes
                // because continue label skips the outer loop early
                System.out.println("i = " + i + "  j = " + j);
            }

            // Whenever continue label is executed,
            // control never reaches here for that value of i
        }

        // Program ends after outer loop finishes all its iterations
    }
}
