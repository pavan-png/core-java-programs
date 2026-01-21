public class Array_1_Dimensional_Eg3 {
    public static void main(String[] args) {

        // Declare and initialize a one-dimensional integer array
        int[] arr = {20, 40, 60, 70};

        // arr.length gives the total number of elements in the array (here: 4)
        // Array indexing starts from 0
        // So valid indexes are: 0, 1, 2, 3
        // Last valid index is: arr.length - 1

        // This loop starts from the last index and moves backwards
        // i is initialized to arr.length - 1 (last valid index)
        // Loop continues while i is greater than or equal to 0
        // i-- moves the index backward on each iteration
        for (int i = arr.length - 1; i >= 0; i--) {

            // Print the element present at index i
            System.out.println(arr[i]);
        }
    }
}
