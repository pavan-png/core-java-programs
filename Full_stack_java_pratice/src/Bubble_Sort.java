import java.util.Scanner;
public class Bubble_Sort {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array  :  ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        for(int a = 0; a <arr.length; a++){
            System.out.print("Enter the element at index " +a + "  :   ");
            arr[a] = sc.nextInt();
        }
        System.out.println();
        System.out.print("Array elements before sorting  :  ");

        for(int b : arr){
            System.out.print(b + "  ");
        }
        int temp =0;
        for (int i = 0; i<arr.length;i++){
            for (int j =1; j<arr.length-i;j++){
                if (arr[j-1]>arr[j]){
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println();
        System.out.print("Using bubble sort  :  ");
        for(int b : arr){
            System.out.print(b + "  ");
        }

    }
}
