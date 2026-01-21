public class Array_Eg6 {

    public static void main(String[] args) {

        // Step 1: Create and initialize array 'a'
        // Index :  0  1  2
        // Value : {9, 8, 7}
        int[] a = {9, 8, 7};

        // Step 2: Create and initialize array 'b'
        // Index :  0  1  2  3  4
        // Value : {1, 2, 3, 4, 5}
        int[] b = {1, 2, 3, 4, 5};

        // Step 3: Assign array reference 'a' to 'b'
        // IMPORTANT:
        // Compiler checks ONLY the type (int[])
        // Length is NOT checked during assignment
        b = a;

        // Step 4: Iterate over array 'b' using for-each loop
        // 'b' now points to the SAME array as 'a'
        for (int i : b) {
            System.out.print(i + " ");
        }
    }
}
