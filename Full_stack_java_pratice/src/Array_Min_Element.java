import java.util.Map;

public class Array_Min_Element {
    public static void main(String[] args) {
        int[] arr = {80,40,90,50,120};
        // assign 0th index element of the array to the min variable
        int min = arr[0];
        for (int i = 0;i<arr.length;i++){
            if (arr[i]<min){
                min = arr[i];
            }

        }
        System.out.println("the min element in the array is "+min);



    }
}
