public class Array_Eg19 {

    // Instance variable 'a'
    // An int array object of size 3 is created using 'new'
    // All elements are automatically initialized to 0
    int[] a = new int[3];

    public static void main(String[] args) {

        // Create an object of Array_Eg19
        // Instance variable 'a' is already initialized
        Array_Eg19 t1 = new Array_Eg19();

        // Prints the reference value of array 'a'
        // This will print something like: [I@1a2b3c4 (hashcode value)
        System.out.println(t1.a);

        // Access the first element of the array
        // Since default value of int is 0, this prints 0
        System.out.println(t1.a[0]);
    }
}
