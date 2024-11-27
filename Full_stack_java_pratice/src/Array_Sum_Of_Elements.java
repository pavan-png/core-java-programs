import java.util.Arrays;

public class Array_Sum_Of_Elements {
    public static void main(String[] args) {
        int[] arr = new int[] {1,2,3,4,5, 255, 6,7,8,9,10};
        int sum =0;
        for (int i =0;i<arr.length;i++){
            sum = sum+arr[i];
        }
        System.out.println("the sum of elements in the array is : "+sum);

        Arrays.sort(arr);
        for (int i =0;i<arr.length;i++){
            System.out.println(arr[i]);
        }


    }
}
