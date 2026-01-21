import java.util.Arrays;   // Imports Arrays utility class

public class Arrays_Utility_Class_Fill_Method_Eg2 {

    public static void main(String[] args) {

        // Initializing an integer array with predefined values
        int[] arr = {1, 2, 3, 0, 0, 0, 5, 6};

        // Printing the original array before using Arrays.fill()
        System.out.print("original array is : ");
        for (int i : arr) {
            System.out.print(i + "  ");
        }

        // Line break for output clarity
        System.out.println();

        // Message before applying Arrays.fill() on a specific range
        System.out.print("arrays fill method :  ");

        /*
         * Arrays.fill(array, fromIndex, toIndex, value)
         *
         * fromIndex (inclusive) :
         *   - Starting index from which the value replacement begins
         *
         * toIndex (exclusive) :
         *   - Ending index which is NOT included in replacement
         *
         * Important:
         *   Replacement happens from fromIndex up to (toIndex - 1)
         *
         * In this example:
         *   fromIndex = 3
         *   toIndex   = 6
         *   value     = 4
         *
         * So elements at index 3, 4, and 5 will be replaced by 4
         * Index 6 and above will remain unchanged
         */

        // Filling array elements from index 3 to index 5 with value 4
        Arrays.fill(arr, 3, 6, 4);

        // Printing the array after applying Arrays.fill()
        for (int i : arr) {
            System.out.print(i + "  ");
        }
    }
}
