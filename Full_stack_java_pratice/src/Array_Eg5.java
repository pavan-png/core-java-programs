public class Array_Eg5 {

    public static void main(String[] args) {

        // Step 1: Create and initialize a 2D array
        // n has 2 rows and 2 columns
        //
        // Index representation:
        // n[0] → {1, 3}
        // n[1] → {2, 4}
        int[][] n = {{1, 3}, {2, 4}};

        // Step 2: Outer loop runs from last row to first row
        // n.length = 2 → last index = 1
        for (int i = n.length - 1; i >= 0; i--) {

            // Step 3: Inner for-each loop iterates over elements of the row
            // NOTE: for-each always goes from LEFT to RIGHT inside the array
            for (int y : n[i]) {
                System.out.print(y + " ");
            }

            // Even though rows are reversed,
            // elements inside each row are printed left to right
        }
    }
}
