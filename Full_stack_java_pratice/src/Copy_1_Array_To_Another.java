public class Copy_1_Array_To_Another {
    public static void main(String[] args) {
        int[] arr = {80,40,90,50,120};
        int[] arr1 = new int[arr.length];
        for (int i = 0;i<arr.length;i++){
            arr1[i] = arr[i];
        }
        System.out.print("Elements in 1st array are : ");
        for (int k :arr){
            System.out.print(k +"  ");
        }
        System.out.println();
        System.out.println();
        System.out.print("Elements in 2nd array are : ");
        for (int j = 0 ; j<arr1.length;j++){
            System.out.print(arr1[j] +"  ");
        }

    }
}
