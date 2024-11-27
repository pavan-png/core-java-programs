import java.util.Arrays;

public class Array_Max_Element {
    public static void main(String[] args) {
        int[] arr = {80,40,90,50,120};
        // assigning the 0th index element of array to max variable
        int max =arr[0];
        for (int i = 0;i< arr.length;i++){
            if (arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("the max element in the array is : "+max);

    }
}
