import java.util.Arrays;
// Arrays utility class is present in java.util package
// It provides useful methods like sort(), fill(), binarySearch(), etc.

public class Arrays_Sort_Method {

    public static void main(String[] args) {

        // Initializing an integer array with unsorted values
        int[] arr = {90, 35, 20, 10, 40, 70, 60, 80, 50};

        // Printing array elements before sorting
        System.out.print("Before sorting  : ");
        for (int i : arr) {
            System.out.print(i + "  ");
        }

        // Sorting the array in ascending order using Arrays.sort()
        // Internally, Arrays.sort() uses an optimized sorting algorithm
        Arrays.sort(arr);

        // Moving to the next line after sorting
        System.out.println();

        // Printing array elements after sorting
        System.out.print("After using sort method  : ");
        for (int i : arr) {
            System.out.print(i + "  ");
        }
    }
}
