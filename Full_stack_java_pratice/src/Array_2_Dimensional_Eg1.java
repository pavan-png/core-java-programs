import java.util.Scanner;

public class Array_2_Dimensional_Eg1 {
    public static void main(String[] args) {

        // Scanner reads input from keyboard (System.in)
        Scanner sc = new Scanner(System.in);

        // Number of outer arrays to be created
        // This decides how many inner array references will exist
        System.out.println("Enter the no classes ");
        int classes = sc.nextInt();

        // Size of each inner array
        // This decides how many int values each inner array can store
        System.out.println("Enter the no student marks ");
        int students = sc.nextInt();

        /*
         CORE CONCEPT:
         int[][] arr means:
         → arr is a reference to an array
         → that array contains references to int[] arrays
         → each int[] array contains actual int values

         Java creates:
         1) one int[] of size 'classes' (array of references)
         2) for each reference, one int[] of size 'students'
        */
        int[][] arr = new int[classes][students];

        /*
         arr.length gives number of inner array references
         i is used to access each inner array one by one
        */
        for (int i = 0; i < arr.length; i++) {

            /*
             arr[i] gives one complete int[] array
             arr[i].length gives size of that particular int[] array
             j is used to access each int value inside that inner array
            */
            for (int j = 0; j < arr[i].length; j++) {

                // Reading value and storing it in the inner array
                // arr[i][j] means:
                // first get the int[] using arr[i]
                // then store value at index j
                System.out.println("Enter the class " + i + " student " + j + " marks");
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("----------- The total classes and marks are -----------");

        /*
         Accessing stored values follows the same rule:
         → first access inner array
         → then access value inside it
        */
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                // arr[i][j] fetches the int value from inner array
                System.out.println("Class " + i + " student " + j + " marks are ");
                System.out.println(arr[i][j]);
            }
        }
    }
}
