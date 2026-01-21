// Linear Search Program
// This program searches for a given element in an array using Linear Search

import java.util.Scanner;

public class Linear_Search {

    public static void main(String[] args) {

        // Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Asking user for the size of the array
        System.out.println("Enter the array size ");
        int size = sc.nextInt();

        // Creating an integer array of given size
        int[] arr = new int[size];

        // Variable to count number of elements entered
        int k = 0;

        // Taking array elements from the user
        for (int i = 0; i < arr.length; i++) {

            // Asking user to enter element for index i
            System.out.println("Enter the " + i + " element in the array ");

            // Storing input value into array
            arr[i] = sc.nextInt();

            // Incrementing count of elements
            k++;
        }

        // Printing separator line
        System.out.println();
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println();

        // Displaying total number of elements entered
        System.out.println("There are " + k + " elements in the array and they are :  ");

        // Printing all array elements
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + "  ");
        }

        // Printing separator line
        System.out.println();
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println();

        // Asking user to enter the element to search
        System.out.println(" Enter the Element to search ");
        int key = sc.nextInt();

        // Flag variable to check whether element is found or not
        boolean flag = false;

        // Linear Search logic:
        // Checking each element one by one from start to end
        for (int l = 0; l < arr.length; l++) {

            // If current array element matches the key
            if (arr[l] == key) {

                // Marking flag as true (element found)
                flag = true;

                // Printing the index where element is found
                System.out.println(" The element is found at " + l + " index ");

                // Exiting loop after finding the element
                break;
            }
        }

        // If flag is still false, element was not found
        if (flag == false) {
            System.out.println("The element is not found");
        }
    }
}
