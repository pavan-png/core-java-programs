// Linear Search g
import java .util.Scanner;
public class Linear_Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // taking the size of the array from user
        System.out.println("Enter the array size ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        int k = 0;

        // taking elements from user and saving in the array
        for (int i = 0; i<arr.length;i++) {
            System.out.println("Enter the " + i + " element in the array ");
            arr[i] = sc.nextInt();
            k++;
        }
        System.out.println();
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println();
        System.out.println("There are "+ k + " elements in the array and they are :  ");

        // printing the array
        for (int j = 0; j<arr.length;j++){
            System.out.print(arr[j] + "  ");
        }

        System.out.println();
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println();

        // taking the key value to serach
        System.out.println(" Enter the Element to search ");
        int key = sc.nextInt();
        boolean flag  = false;

        // checking each and every index one by one for the key
        for(int l =0 ; l<arr.length;l++){
            if (arr[l]==key){
                flag = true;
                System.out.println(" The element is found at " +l + " index ");
                break;
            }
        }
        if (flag == false) {
            System.out.println("The element is not found");
        }


    }
}
