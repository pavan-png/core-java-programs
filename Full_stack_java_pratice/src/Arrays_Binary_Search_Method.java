import java.util.Arrays;

public class Arrays_Binary_Search_Method {
    public static void main(String[] args) {
        int [] arr = {90,35,20,10,40,70,60,80,50};
        System.out.print("Before sorting  : ");
        for (int i : arr){
            System.out.print(i +"  ");
        }
        Arrays.sort(arr);
        System.out.println();
        System.out.print("After using sort method  : ");
        for (int i : arr){
            System.out.print(i +"  ");
        }
        System.out.println();
        int x = Arrays.binarySearch(arr,40);
        System.out.println("The element is fond at index :  " + x);

        // if the key is not found at the index, jvm will place the key in suitable place (sorted order) and returns
        // the index with negative value .
        int y = Arrays.binarySearch(arr,15);
        System.out.println("The key is placed in the sorted array with -ve value  "+y);
    }
}
