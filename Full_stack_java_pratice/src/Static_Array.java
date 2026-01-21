public class Static_Array {

    // Static array reference variable
    // Static variables are created when the class is loaded
    // Default value for any reference type is NULL
    private static int[] arr;

    public static void main(String[] args) {

        // Condition check
        // PROBLEM:
        // arr is NULL, but arr.length is accessed first
        // Accessing any member on NULL causes NullPointerException
        if (arr.length > 0 && arr != null)

            // This line will never be reached
            // because exception occurs before condition completes
            System.out.println(arr[0]);
    }
}
