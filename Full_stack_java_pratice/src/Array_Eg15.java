public class Array_Eg15 {
    public static void main(String[] args) {

        // Java creates a 2D array reference named 'arr'
        // It initially points to an array that can hold 3 row references
        // Each row reference points to an int array of size 2
        int[][] arr = new int[3][2];

        // At this point:
        // arr has 3 rows → each row has exactly 2 columns

        // Java replaces ONLY the first row reference
        // The old row[0] of size 2 is discarded
        // A new int array of size 3 is attached to row[0]
        arr[0] = new int[3];

        // Now the array is uneven (jagged):
        // row[0] → size 3
        // row[1] → size 2
        // row[2] → size 2

        // Java replaces ONLY the second row reference
        // The old row[1] of size 2 is discarded
        // A new int array of size 4 is attached to row[1]
        arr[1] = new int[4];

        // Now the structure looks like:
        // row[0] → 3 elements
        // row[1] → 4 elements
        // row[2] → 2 elements

        // Java now changes the entire 'arr' reference
        // The previously created 2D array becomes unreachable
        // A completely new 2D array is created
        // This new array has 4 rows and 3 columns each
        arr = new int[4][3];

        // Final structure:
        // row[0] → 3
        // row[1] → 3
        // row[2] → 3
        // row[3] → 3

        // Old arrays are not destroyed immediately
        // They are left for Garbage Collector to clean up
    }
}
