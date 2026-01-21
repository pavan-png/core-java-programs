import java.util.*;   // Imports Scanner and Arrays utility classes

public class Arrays_Utility_Class_Fill_Method {

    public static void main(String[] args) {

        // Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Asking user to enter the size of the array
        // (Note: size is taken, but fixed array size 4 is used below)
        System.out.print("enter the sze of  the array                                                                   : ");
        int size = sc.nextInt();

        // Creating an integer array of fixed size 4
        // By default, all int array elements are initialized to 0
        int[] arr = new int[4];

        // Printing array elements without explicit initialization
        // Default value of int in Java is 0
        System.out.print("printing array without intilization (default values of int given)                             : ");
        for (int i : arr) {
            System.out.print(i + "  ");
        }

        System.out.println();

        // Separator line for clarity in output
        System.out.println("-----------------------------------------------------------------------------------using Arrays fill method------------------------------------------------------------------------------------------------");

        // Asking user to enter a number to fill the array
        System.out.print("Enter the number to use int the fill method                                                   : ");
        int fill = sc.nextInt();

        // Using Arrays.fill() method to assign the same value to all array elements
        Arrays.fill(arr, fill);

        // Printing array elements after using Arrays.fill()
        System.out.print("printing array using Arrays fill method                                                       : ");
        for (int i : arr) {
            System.out.print(i + "  ");
        }
    }
}
