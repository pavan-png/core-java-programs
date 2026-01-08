public class Array_Eg25 {

    public static void main(String[] args) {

        // One-dimensional integer array
        // Elements: 1, 3, 5, 7, 9
        int[] ia = {1, 3, 5, 7, 9};

        // Outer for-each loop
        // 'x' takes one value from array ia at a time
        for (int x : ia) {

            // Inner for loop
            // 'j' will take values 0, 1, 2
            for (int j = 0; j < 3; j++) {

                // If x is greater than 4 AND less than 8
                // (i.e., x = 5 or x = 7)
                // then skip the remaining statements
                // and continue with the next iteration of INNER loop
                if (x > 4 && x < 8)
                    continue;

                // This line executes only when the above condition is false
                // Prints the current value of x
                System.out.print(" " + x);

                // If j becomes 1
                if (j == 1)
                    // break stops ONLY the INNER loop
                    break;

                // This continue moves control to the next
                // iteration of the INNER loop
                continue;
            }

            // This continue moves control to the next
            // iteration of the OUTER for-each loop
            continue;
        }
    }
}
