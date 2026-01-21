import java.util.Arrays;
// (Note: Arrays import is not required here, but kept if needed later)

public class Array_Max_Element {

    public static void main(String[] args) {

        // Step 1: Create and initialize the integer array
        // This array stores multiple int values in continuous memory
        int[] arr = {80, 40, 90, 50, 120};

        // Step 2: Assume the first element is the maximum
        // We need an initial value to compare with other elements
        int max = arr[0];

        // Step 3: Traverse the array using index-based for loop
        // arr.length gives the total number of elements
        for (int i = 0; i < arr.length; i++) {

            // Step 4: Compare current element with max
            // If current element is greater, update max
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // Step 5: Print the maximum element found in the array
        System.out.println("The max element in the array is : " + max);
    }
}
