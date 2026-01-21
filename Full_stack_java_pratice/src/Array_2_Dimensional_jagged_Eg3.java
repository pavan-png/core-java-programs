public class Array_2_Dimensional_jagged_Eg3 {

    public static void main(String[] args) {

        // A 2D jagged array
        // Internally this is an array of int[] references
        // arr[0] -> {10, 20}
        // arr[1] -> {30, 40, 50}
        // arr[2] -> {60, 70, 80, 90}
        int[][] arr = {{10,20},{30,40,50},{60,70,80,90}};

        // OUTER for-each loop
        // Iterates over each 1D array inside the 2D array
        // 'a' is a reference to one row (int[]) at a time
        for (int a[] : arr) {

            // INNER for-each loop
            // Iterates over each element inside the current 1D array
            // 'b' receives one value at a time from array 'a'
            for (int b : a) {

                // Prints the current element
                // 'b' is a local copy of the array value
                System.out.print(b + " ");
            }

            // Moves to the next line after printing all elements
            // of the current inner array
            System.out.println();
        }
    }
}
