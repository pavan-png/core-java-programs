import java.util.Scanner;

public class Array_1_Dimensional_Eg1 {
    public static void main(String[] args) {

        // Scanner object is used to take input from the user
        Scanner sc = new Scanner(System.in);

        // Step 1: Ask the user for the size of the array
        System.out.println("enter the size of the array");

        // Read the size entered by the user
        // This size decides how many elements the array can store
        int size = sc.nextInt();

        // Step 2: Create a one-dimensional integer array
        // The array size is fixed at runtime based on user input
        int[] ar = new int[size];

        // Step 3: Take input from the user and store it in the array
        // Loop runs from index 0 to (length - 1)
        for (int i = 0; i < ar.length; i++) {

            // Ask the user to enter a value for each index
            System.out.println("Enter the " + i + " element ");

            // Store the entered value at index i
            ar[i]=sc.nextInt();
        }

        // Step 4: Display all elements of the array
        System.out.println("the array consists of elements");

        // Loop through the array to read and print each element
        for (int i = 0; i < ar.length; i++) {

            // Print the value stored at index i
            System.out.println(ar[i]);
        }
    }
}
