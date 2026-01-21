public class Array_Eg19 {
    public static void main(String[] args) {

        // Create a 2D int array
        // a refers to an array of int[] objects
        int[][] a = {{1,2},{3,4}};

        // a[1] is already a 1D int array (int[])
        // No real type casting is needed here
        // The cast works, but it is redundant
        int[] b = (int[]) a[1];

        // Assign 2D array reference to Object type
        // This is UPCASTING (implicit and always allowed)
        Object o1 = a;

        /*
         Object cannot be automatically converted back to int[][]
         because Object is a parent type.
         Hence, EXPLICIT DOWNCASTING is required.

         This is valid because:
         - The actual object referenced by o1 is int[][]
         - Array is a child of Object
        */
        int[][] a2 = (int[][]) o1;

        // Prints element at index 1 of array b
        // b = {3, 4}
        System.out.println(b[1]);   // Output: 4

        // Prints reference of int[] b (type + hashcode)
        System.out.println(b);

        // Prints reference of Object o1 (still points to int[][])
        System.out.println(o1);
    }
}
