import java.util.Scanner;
public class Array_1_Dimensional_Eg1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Ask user for array size
        System.out.println("enter the size of the array");
        int size = sc.nextInt();   // Example: if user enters 5, array can hold 5 integers

        // Step 2: Create array with given size
        int[] ar = new int[size];

        // Step 3: Take input from user and store in array
        for(int i = 0; i < ar.length; i++) {  // ar.length gives the number of elements in array
            System.out.println("Enter the " + i + " element ");
            ar[i] = sc.nextInt();   // Store user input at index i
        }

        // Step 4: Display the array elements
        System.out.println("the array consists of elements");
        for(int i = 0; i < ar.length; i++) {
            System.out.println(ar[i]);
        }
    }
}
