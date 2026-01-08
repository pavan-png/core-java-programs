public class Array_Eg20 {

    // Instance variable (class-level)
    // This is only a reference variable
    // Default value for reference types is null
    int[] a;

    public static void main(String[] args) {

        // Local array variable declaration
        // No memory is allocated and no default value is given
        int[] b;

        /*
         If a local array variable is declared without creating the array object,
         it cannot be accessed.
         Trying to use 'b' will result in a compile-time error
         because local variables do NOT get default values.
         */

        // Compile-time error: variable b might not have been initialized
        // System.out.println(b);

        // Create an object of Array_Eg20
        // Instance variable 'a' gets default value null
        Array_Eg20 obj = new Array_Eg20();

        // Printing a reference variable is allowed
        // Output: null
        System.out.println(obj.a);

        // Trying to access an element of a null array reference
        // This causes NullPointerException at runtime
        System.out.println(obj.a[0]);
    }
}
