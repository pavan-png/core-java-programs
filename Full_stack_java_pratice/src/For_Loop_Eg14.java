public class For_Loop_Eg14 {
    public static void main(String[] args) {

        // Label is attached to the outer loop,
        // but it will NOT be used because continue is NOT labeled
        label:
        for (int i = 0; i < 3; i++) {

            // Inner loop controls the j values for each i
            for (int j = 0; j < 3; j++) {

                // When i and j are equal, we do NOT want to print them
                // So we skip printing for that particular (i, j) pair
                if (i == j)

                    // continue does NOT stop the loop
                    // It only ignores this one case
                    // and moves to the next j value
                    continue;

                // This line runs only for valid (i, j) pairs
                // where i and j are different
                System.out.println("i = " + i + "  j = " + j);
            }

            // After all j values are processed,
            // the outer loop moves to the next i value
        }

        // Program ends after all valid combinations are printed
    }
}
