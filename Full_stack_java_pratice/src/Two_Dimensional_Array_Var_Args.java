public class Two_Dimensional_Array_Var_Args {

    // Accepts any number of int arrays; var-args of int[] behaves like a 2D array.
    void m1(int[]... x) {  // 2d array
        // Prints the reference for the outer array (not the contents).
        System.out.println(x);
        // Iterate over each inner int[] array.
        for (int[] a : x) {
            // Prints the reference for the current inner array.
            System.out.println(a);
            // Iterate over each element in the current inner array.
            for (int c : a) {
                // Print each element value.
                System.out.println(c);
            }
        }
    }

    public static void main(String[] args) {
        // Create an instance to call the non-static method.
        Two_Dimensional_Array_Var_Args obj = new Two_Dimensional_Array_Var_Args();
        // Define two one-dimensional arrays.
        int[] d = {10,20,30};
        int[] e = {30,40};
        // Pass both arrays as var-args (effectively a 2D array input).
        obj.m1(d,e);
    }
}
