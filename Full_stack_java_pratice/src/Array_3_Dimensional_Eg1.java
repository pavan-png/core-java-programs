import java.util.Scanner;

public class Array_3_Dimensional_Eg1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // A 3D array needs three sizes
        // 1st size  → number of 2D arrays
        // 2nd size  → number of 1D arrays inside each 2D array
        // 3rd size  → number of actual values inside each 1D array

        System.out.println("Enter size of first dimension");
        int d1 = sc.nextInt();

        System.out.println("Enter size of second dimension");
        int d2 = sc.nextInt();

        System.out.println("Enter size of third dimension");
        int d3 = sc.nextInt();

        // Creating a 3D array
        // arr → reference to 3D structure
        // arr[i]      → stores reference to a 2D array
        // arr[i][j]   → stores reference to a 1D array
        // arr[i][j][k]→ stores actual value
        int[][][] arr = new int[d1][d2][d3];

        // Input values into the 3D array
        for (int i = 0; i < arr.length; i++) {
            // i moves through 2D arrays (first dimension)

            for (int j = 0; j < arr[i].length; j++) {
                // j moves through 1D arrays inside the selected 2D array

                for (int k = 0; k < arr[i][j].length; k++) {
                    // k moves through actual values inside the selected 1D array

                    System.out.println("Enter value for index [" + i + "][" + j + "][" + k + "]");
                    // Storing actual value at third dimension
                    arr[i][j][k] = sc.nextInt();
                }
            }
        }

        // Reading values from the 3D array
        System.out.println("----------- Stored values -----------");

        for (int i = 0; i < arr.length; i++) {
            // Accessing each 2D array

            for (int j = 0; j < arr[i].length; j++) {
                // Accessing each 1D array inside the 2D array

                for (int k = 0; k < arr[i][j].length; k++) {
                    // Accessing actual values

                    System.out.println(
                            "Value at [" + i + "][" + j + "][" + k + "] = " + arr[i][j][k]
                    );
                }
            }
        }
    }
}
