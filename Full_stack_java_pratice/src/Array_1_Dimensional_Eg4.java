public class Array_1_Dimensional_Eg4 {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70};
        for(int i = 0; i < arr.length; i++) {
            System.out.println("arr[ " + i + " ] : " + arr[i]);
            i++;  // manual increment inside loop
        }
    }
}
