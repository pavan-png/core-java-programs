public class Array_Eg16 {

    // Instance variable 'a'
    // Default value for any reference type in Java is null
    int[] a;

    public static void main(String[] args) {

        // Create an object of Array_Eg16
        // Instance variable 'a' is automatically initialized to null
        Array_Eg16 t1 = new Array_Eg16();

        // Prints the value of reference 'a'
        // Output: null
        System.out.println(t1.a);

        // Attempts to access index 0 of array 'a'
        // Since 'a' is null, this line throws NullPointerException
        System.out.println(t1.a[0]);
    }
}
