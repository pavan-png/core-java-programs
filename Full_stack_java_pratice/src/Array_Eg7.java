public class Array_Eg7 {
    public static void main(String[] args) {

        // Step 1: Create and initialize the integer array
        // This array stores year values
        int[] data = {2010, 2013, 2014, 2015, 2014};

        // Step 2: Key value to be searched in the array
        int key = 2014;

        // Step 3: Variable to count how many times the key appears
        int count = 0;

        // Step 4: for-each loop iterates over each element in the array
        for (int e : data) {

            // Step 5: Check if current element is NOT equal to key
            if (e != key) {

                // continue immediately skips the remaining statements
                // of the current loop iteration and jumps to next iteration
                continue;

                // count++;
                // This statement is UNREACHABLE
                // because continue always transfers control to the next iteration
                // Java compiler detects this at compile time
                // and throws "unreachable statement" Compile Time Error
            }

            // NOTE:
            // When e == key, control comes here
            // But since count++ is missing outside the if block,
            // count is never incremented in this program
        }

        // Step 6: Print the final count value
        // Since count is never incremented, output will be 0
        System.out.println(count + " found ");
    }
}
