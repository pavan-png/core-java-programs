public class Array_Eg1 {
    public static void main(String[] args) {
        int[] arr = {0,2,4,1,3};
        for (int i =0;i<arr.length;i++)
            arr[i] = arr[(arr[i]+3)/5];
        System.out.println(arr[1]);
    }
}
