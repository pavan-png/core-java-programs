import java.util.Scanner;
public class Binary_Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // taking the  size of array from user
        System.out.println("Enter the size of the array ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        // taking the array input from the user
        for(int i = 0 ;i<arr.length;i++){
            System.out.println("Enter the " +i+ " element ");
            arr[i] = sc.nextInt();
        }
        System.out.print ("Elements you entered are :             ");

        // printing the elements
        for (int j = 0; j<arr.length;j++ ){
            System.out.print(arr[j] +"     ");
        }
        System.out.println(  );
        System.out.println( );
        System.out.print("Their sorted order is    :             ");
        int temp;

        // sorting the array
        for (int k = 0;k<arr.length;k++){
            for (int l = k+1; l<arr.length;l++){
                if (arr[k]>arr[l]){
                    temp = arr[k];
                    arr[k] = arr[l];
                    arr[l] = temp;

                }
            }
        }

        // printing the sorted elements
        for (int m = 0 ; m<arr.length;m++){
            System.out.print(arr[m]+ "     ");
        }
        System.out.println();
        System.out.println();

        // taking the key from user to search
        System.out.println("Enter the element to search ");
        int key = sc.nextInt();
        int low = 0;
        int high = arr.length-1;
        int mid;

        // performing binary search
        while (low<=high){
             mid = (low+high)/2;
            if(key == arr[mid]){
                System.out.println("Element is found at  index    :  "+mid );
                break;
            } else if (key<arr[mid]) {
                high = mid-1;
            }
            else if (key>arr[mid]){
                low = mid+1;
            }
        }

        if (low > high){
            System.out.println("The key you have entered is not found in the array");
        }

    }
}
