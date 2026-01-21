import java.util.Scanner;

public class Array_2_D_Jagged {
    public static void main(String[] args) {

        // Scanner object is used to read input from keyboard
        Scanner sc = new Scanner(System.in);

        // Variables to store outer and inner array sizes
        int outerArraySize;
        int innerArraySize;

        // Taking size for the outer array
        // This decides how many inner array references will exist
        System.out.println("enter the outer array size");
        outerArraySize = sc.nextInt();

        /*
         CORE CONCEPT:
         int[][] arr means an array of int[] references
         Here only the outer array is created
         Inner arrays are NOT created yet (they are null)
        */
        int[][] arr = new int[outerArraySize][];

        /*
         Each iteration:
         → arr[i] is assigned a new int[] array
         → size of each inner array can be different
         This is why it is called a JAGGED array
        */
        for (int i = 0; i < outerArraySize; i++) {

            // Taking size for the current inner array
            System.out.println("enter the size of inner array arr:[ " + i + " ]");
            innerArraySize = sc.nextInt();

            // Creating the inner array and assigning its reference to arr[i]
            arr[i] = new int[innerArraySize];
        }

        /*
         Input loop:
         → first access an inner array using arr[i]
         → then store values inside that inner array using index j
        */
        for (int i = 0; i < arr.length; i++) {

            // arr[i].length gives size of the current inner array
            for (int j = 0; j < arr[i].length; j++) {

                // arr[i][j] means:
                // get inner array using arr[i]
                // store value at index j
                System.out.println("enter the marks for " + i + " class and " + j + " student ");
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("----------- total elements are -----------");

        /*
         Output loop:
         → outer loop selects one inner array
         → inner loop prints all values of that inner array
        */
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                // Fetching value from the inner array
                System.out.println(i + " class and " + j + " student marks are " + arr[i][j]);
            }
        }
    }
}
