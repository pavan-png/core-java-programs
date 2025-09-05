public class Array_1_Dimensional_Eg2 {
    public static void main(String[] args) {

        int[] ar = new int[]{20,40,50,50};
        int[] arr = {10,20,30,40};
        // both the above declarations are valid

        // For-each loop  (Enhanced for loop) for 1st array (ar)
        System.out.println("Elements of first array (ar):");
        for (int num : ar) {
            System.out.println(num);
        }

        // For-each loop for 2nd array (arr)
        System.out.println("Elements of second array (arr):");
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
