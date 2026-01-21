public class Array_Eg9 {

    public static void main(String[] args) {

        // Step 1: Create a 2D integer array with 2 rows and 4 columns
        // At this stage, memory is allocated for 2 row references
        // Each row initially has length 4 with default values 0
        int[][] arr = new int[2][4];

        // Step 2: Reassign the first row with a new 1D array of length 4
        // Old row array at arr[0] becomes eligible for garbage collection
        arr[0] = new int[]{1, 3, 5, 7};

        // Step 3: Reassign the second row with a new 1D array of length 2
        // This makes the 2D array a JAGGED (uneven) array
        // Old row array at arr[1] (length 4) becomes eligible for garbage collection
        arr[1] = new int[]{1, 3};

        // Step 4: Outer for-each loop iterates over each row (1D array)
        for (int[] i : arr) {

            // Step 5: Inner for-each loop iterates over elements of the current row
            // for-each always traverses from left to right
            for (int j : i) {
                System.out.print(j + " ");
            }

            // Move to next line after printing one row
            System.out.println();
        }
    }
}
