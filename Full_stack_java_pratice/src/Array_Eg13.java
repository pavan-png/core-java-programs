public class Array_Eg14 {
    public static void main(String[] args) {

        // Create an int array of size 3
        // JVM allocates memory for 3 int values
        // All int elements are initialized with default value 0
        int[] a = new int[3];

        // Printing the array reference directly
        // This does NOT print array elements
        // It prints the class name + @ + hashcode (hexadecimal form)
        // Example output: [I@15db9742
        System.out.println(a);

        // Printing the element at index 0
        // Since int default value is 0
        // Output will be: 0
        System.out.println(a[0]);
    }
}
