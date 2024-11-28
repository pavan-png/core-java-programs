import java.util.Arrays;

public class Arrays_Utility_Class_Fill_Method_Eg2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,0,0,0,5,6};
        System.out.print("original array is : ");
        for (int i :arr){
            System.out.print(i +"  ");
        }
        // using arrays fill method to store numbers in a particular index range

        System.out.println();
        System.out.print("arrays fill method :  ");
        /* from index says, from which index you should start
           to index says from which index you should ignore it
           here we want to replace any number from 2 index to 5 index , so end index should be given 6 ,
           so compiler understands from index 6 I should ignore replacing the number .
         */
        Arrays.fill(arr,3,6,4);
        for (int i :arr){
            System.out.print(i+"  ");
        }

    }
}
