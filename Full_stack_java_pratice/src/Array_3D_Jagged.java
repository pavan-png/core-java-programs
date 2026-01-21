import java.util.*;

public class Array_3D_Jagged {
    public static void main(String[] args) {

        // Scanner object is used to read input from keyboard
        Scanner sc = new Scanner(System.in);

        // Step 1: Read size of the first dimension
        // This decides how many top-level references will be created
        System.out.println("Enter the number of colleges: ");
        int colleges = sc.nextInt();

        /*
         CORE CONCEPT:
         int[][][] arr means:
         - arr is a reference to an array
         - that array holds references to 2D arrays
         - inner arrays are NOT created yet

         Since only the first dimension is created,
         this becomes a 3D JAGGED array.
        */
        int[][][] arr = new int[colleges][][];

        // Step 2: Create second dimension dynamically
        for (int i = 0; i < colleges; i++) {

            // For the current first-level element,
            // read how many second-level arrays are needed
            System.out.println("Enter the number of classes in college " + i + ": ");
            int classes = sc.nextInt();

            /*
             arr[i] now points to a new array of references
             Size of this array can differ for each i
            */
            arr[i] = new int[classes][];

            // Step 3: Create third dimension dynamically
            for (int j = 0; j < classes; j++) {

                // Read size of the deepest level
                System.out.println(
                        "Enter the number of students in college " + i + ", class " + j + ": ");
                int students = sc.nextInt();

                /*
                 arr[i][j] now points to a new array of int values
                 Size of this array can differ for each j
                */
                arr[i][j] = new int[students];
            }
        }

        // Step 4: Store values in the jagged 3D array
        for (int i = 0; i < arr.length; i++) {

            // arr[i] represents one second-level group
            for (int j = 0; j < arr[i].length; j++) {

                // arr[i][j] represents one third-level array
                for (int k = 0; k < arr[i][j].length; k++) {

                    /*
                     arr[i][j][k] access order:
                     - first select first-level reference
                     - then select second-level reference
                     - then store value at deepest level
                    */
                    System.out.print(
                            "Enter marks for college " + i +
                                    ", class " + j +
                                    ", student " + k + ": ");

                    arr[i][j][k] = sc.nextInt();
                }
            }
        }

        // Step 5: Read and display all stored values
        System.out.println("------------- Total Data -------------");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[i][j].length; k++) {

                    // Fetch and print the value stored at the deepest level
                    System.out.println(
                            "College " + i +
                                    ", Class " + j +
                                    ", Student " + k +
                                    " -> " + arr[i][j][k]);
                }
            }
        }
    }
}
