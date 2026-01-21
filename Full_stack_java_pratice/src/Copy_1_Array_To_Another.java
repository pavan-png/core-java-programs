public class Copy_1_Array_To_Another {

    public static void main(String[] args) {

        // Step 1: Create and initialize the first array
        // This array stores the original data
        int[] arr = {80, 40, 90, 50, 120};

        // Step 2: Create a second array with the same size as the first array
        // This array will hold the copied elements
        int[] arr1 = new int[arr.length];

        // Step 3: Copy each element from first array to second array
        // Index-by-index copying ensures values are duplicated, not referenced
        for (int i = 0; i < arr.length; i++) {
            arr1[i] = arr[i];
        }

        // Step 4: Print elements of the first array using for-each loop
        System.out.print("Elements in 1st array are : ");
        for (int k : arr) {
            System.out.print(k + "  ");
        }

        // Print new lines for better readability
        System.out.println();
        System.out.println();

        // Step 5: Print elements of the second array using index-based for loop
        System.out.print("Elements in 2nd array are : ");
        for (int j = 0; j < arr1.length; j++) {
            System.out.print(arr1[j] + "  ");
        }
    }
}
