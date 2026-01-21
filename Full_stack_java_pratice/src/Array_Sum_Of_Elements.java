import java.util.Arrays;
// Arrays class provides utility methods like sort(), binarySearch(), etc.

public class Array_Sum_Of_Elements {

    public static void main(String[] args) {

        // Step 1: Create and initialize an integer array
        // This array stores multiple int values in continuous memory
        int[] arr = {1, 2, 3, 4, 5, 255, 6, 7, 8, 9, 10};

        // Step 2: Variable to store the sum of array elements
        int sum = 0;

        // Step 3: Loop through the array using index-based for loop
        // arr.length gives the total number of elements in the array
        for (int i = 0; i < arr.length; i++) {

            // Add each element to the sum
            sum = sum + arr[i];
        }

        // Step 4: Print the total sum of all array elements
        System.out.println("The sum of elements in the array is : " + sum);

        // Step 5: Sort the array in ascending order
        // Arrays.sort() modifies the original array
        Arrays.sort(arr);

        // Step 6: Print the sorted array elements
        for (int i = 0; i < arr.length; i++) {

            // Prints elements from smallest to largest
            System.out.println(arr[i]);
        }
    }
}
