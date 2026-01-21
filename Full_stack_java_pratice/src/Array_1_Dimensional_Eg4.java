public class Array_1_Dimensional_Eg4 {
    public static void main(String[] args) {

        // Declare and initialize a one-dimensional integer array
        int[] arr = {10, 20, 30, 40, 50, 60, 70};

        // This for loop starts from index 0 and runs till the last index
        // Normally, i++ in the for loop header increments i by 1 each time
        for (int i = 0; i < arr.length; i++) {

            // Print the current index and its corresponding value
            System.out.println("arr[ " + i + " ] : " + arr[i]);

            // Manual increment inside the loop body
            // This causes i to increase by 2 in each iteration:
            // 1 increment from here + 1 increment from the for-loop update
            i++;
        }
    }
}
