public class One_Dimensional_Array_Var_Args {
    // Method that accepts any number of int values using var-args.
    public void m1(int... c) {
        // Enhanced for-loop iterates through each element in the var-args array.
        for (int b : c) {
            // Print each element to the console.
            System.out.println(b);
        }
    }

    public static void main(String[] args) {
        // Create an instance to call the non-static method.
        One_Dimensional_Array_Var_Args obj = new One_Dimensional_Array_Var_Args();
        // Pass multiple int values; they are treated as a one-dimensional array.
        obj.m1(10, 20, 30);
    }
}
