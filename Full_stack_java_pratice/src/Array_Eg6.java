public class Array_Eg6 {
    public static void main(String[] args) {
        // for array assignment compiler will check only the type not the lemgth .
        int[] a = {1,2,3};
        int[] b = {1,2,3,4,5};
         b = a;
        for (int i : b){
            System.out.print(i + " ");
        }
    }
}
