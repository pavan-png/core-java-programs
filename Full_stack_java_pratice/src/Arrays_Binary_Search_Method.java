import java.util.Arrays;   // Imports Arrays utility class

public class Arrays_Binary_Search_Method {

    public static void main(String[] args) {

        // Initializing an integer array with unsorted values
        int[] arr = {90, 35, 20, 10, 40, 70, 60, 80, 50};

        // Printing array elements before sorting
        System.out.print("Before sorting  : ");
        for (int i : arr) {
            System.out.print(i + "  ");
        }

        // Sorting the array in ascending order
        // Binary search works ONLY on sorted arrays
        Arrays.sort(arr);

        // Printing array elements after sorting
        System.out.println();
        System.out.print("After using sort method  : ");
        for (int i : arr) {
            System.out.print(i + "  ");
        }

        System.out.println();

        // Performing binary search for an existing element (40)
        // If the element is found, its index is returned
        int x = Arrays.binarySearch(arr, 40);
        System.out.println("The element is found at index :  " + x);

        /*
         * Performing binary search for a non-existing element (15)
         *
         * If the key is NOT found:
         * Arrays.binarySearch() returns a NEGATIVE value.
         *
         * Returned value formula:
         *   -(insertionPoint) - 1
         *
         * insertionPoint:
         *   The index at which the key would be inserted
         *   to keep the array in sorted order
         */
        int y = Arrays.binarySearch(arr, 15);

        // Printing the negative index returned by binarySearch()
        System.out.println("The key is placed in the sorted array with -ve value  " + y);
    }
}
