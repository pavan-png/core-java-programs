import java.util.Scanner;

public class Binary_Search {

    public static void main(String[] args) {

        // Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Asking user for the size of the array
        System.out.println("Enter the size of the array ");
        int size = sc.nextInt();

        // Creating an integer array of given size
        int[] arr = new int[size];

        // Taking array elements from the user
        for (int i = 0; i < arr.length; i++) {

            // Reading each element and storing it in the array
            System.out.println("Enter the " + i + " element ");
            arr[i] = sc.nextInt();
        }

        // Display message before printing the array
        System.out.print("Elements you entered are :             ");

        // Printing the elements entered by the user
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + "     ");
        }

        System.out.println();
        System.out.println();

        // Message before displaying sorted array
        System.out.print("Their sorted order is    :             ");

        int temp; // Temporary variable used for swapping during sorting

        // Sorting the array in ascending order
        // (This logic compares each element with remaining elements and swaps if needed)
        for (int k = 0; k < arr.length; k++) {
            for (int l = k + 1; l < arr.length; l++) {

                // If element at index k is greater than element at index l, swap them
                if (arr[k] > arr[l]) {
                    temp = arr[k];
                    arr[k] = arr[l];
                    arr[l] = temp;
                }
            }
        }

        // Printing the sorted array elements
        for (int m = 0; m < arr.length; m++) {
            System.out.print(arr[m] + "     ");
        }

        System.out.println();
        System.out.println();

        // Taking the key element to search from the user
        System.out.println("Enter the element to search ");
        int key = sc.nextInt();

        // Initializing binary search variables
        int low = 0;                  // Starting index
        int high = arr.length - 1;    // Ending index
        int mid;                      // Middle index

        // Performing Binary Search
        while (low <= high) {

            // Calculating middle index
            mid = (low + high) / 2;

            // If key is found at middle index
            if (key == arr[mid]) {
                System.out.println("Element is found at  index    :  " + mid);
                break;
            }
            // If key is smaller than middle element, search left half
            else if (key < arr[mid]) {
                high = mid - 1;
            }
            // If key is greater than middle element, search right half
            else if (key > arr[mid]) {
                low = mid + 1;
            }
        }

        // If low becomes greater than high, element is not found
        if (low > high) {
            System.out.println("The key you have entered is not found in the array");
        }
    }
}
