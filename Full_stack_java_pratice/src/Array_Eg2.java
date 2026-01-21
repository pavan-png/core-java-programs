public class Array_Eg2 {

    public static void main(String[] args) {

        // Step 1: Create and initialize the array
        // Index :  0  1  2  3  4
        // Value : {1, 2, 3, 4, 5}
        int[] a = {1, 2, 3, 4, 5};

        // Step 2: for-loop starts with i = 0
        // Condition: i < 5
        // Increment: i = i + 2 (skips one index each time)
        for (int i = 0; i < 5; i += 2) {

            // Step 3: Print the element at index i
            System.out.print(a[i] + " ");
        }
    }
}
