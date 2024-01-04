public class Array_1_Dimensional_Eg3 {
    public static void main(String[] args) {
        int[] arr = {20,40,60,70};

        // use length -1 , because since 4 elements arr.length gives output 4 , but array index ranging from 0 ,1,2,3 .
        for(int i = arr.length-1;i>=0;i--){
            System.out.println(arr[i]);
        }

    }
}
