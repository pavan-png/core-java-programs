public class Array_Eg8 {

    public static void main(String[] args) {

        // Step 1: Declare an integer array reference
        // No array object is created at this point
        int[] numbers;

        // Step 2: Create a new array object of size 2
        // Memory for 2 integers is allocated in heap
        // Default values are 0
        numbers = new int[2];

        // Step 3: Assign values to index 0 and 1 of the first array object
        numbers[0] = 10;
        numbers[1] = 20;

        // Step 4: Reassign the same reference to a NEW array object of size 4
        // This does NOT increase the size of the existing array
        // A completely new array object is created
        // The old array {10, 20} becomes eligible for garbage collection
        numbers = new int[4];

        // Step 5: Assign values to index 2 and 3 of the new array object
        // Index 0 and 1 still contain default values (0)
        numbers[2] = 30;
        numbers[3] = 40;

        // Step 6: Iterate over the array using for-each loop
        // for-each prints all elements of the CURRENT array object
        for (int i : numbers) {
            System.out.println(i);
        }

        /*
         * IMPORTANT NOTES:
         *
         * 1) Array size in Java is FIXED once an array object is created.
         * 2) You cannot increase or decrease the size of an existing array.
         * 3) Reassigning an array reference creates a NEW array object,
         *    it does NOT resize the old one.
         *
         * Example of INVALID code:
         *
         * int[] a = {2, 3, 4};
         * a = {20, 6, 7, 8};   // ❌ Compile Time Error
         *
         * Reason:
         * - Array literals {} can be used ONLY at the time of declaration.
         *
         * Why 'numbers' code works:
         * - 'numbers' is declared once
         * - Two DIFFERENT array objects are created using 'new'
         * - Reference is redirected to the new array
         */
    }
}
