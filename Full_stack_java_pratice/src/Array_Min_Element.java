import java.util.Map;
// (Note: Map import is not required here and can be removed)

public class Array_Min_Element {

    public static void main(String[] args) {

        // Step 1: Create and initialize the integer array
        // The array stores multiple int values in continuous memory
        int[] arr = {80, 40, 90, 50, 120};

        // Step 2: Assume the first element is the minimum
        // We need an initial value for comparison
        int min = arr[0];

        // Step 3: Traverse the array using index-based for loop
        // arr.length gives the total number of elements in the array
        for (int i = 0; i < arr.length; i++) {

            // Step 4: Compare current element with min
            // If current element is smaller, update min
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        // Step 5: Print the minimum element found in the array
        System.out.println("The min element in the array is : " + min);
    }
}
