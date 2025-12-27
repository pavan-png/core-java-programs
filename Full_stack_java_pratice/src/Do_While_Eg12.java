public class Do_While_Eg12 {
    public static void main(String[] args) {

        // x is initialized to 0
        int x = 0;

        // do-while loop starts
        // IMPORTANT: do-while executes the body FIRST
        do {

            // Pre-increment x
            // x becomes 1 in the first iteration
            ++x;

            // Prints the current value of x
            System.out.println(x);

            // Pre-increment x again and compare with 5
            // If (++x < 5) is true, continue is executed
            if (++x < 5)

                // continue skips the remaining statements
                // Control goes directly to the while condition
                continue;

            // This line executes ONLY if (++x < 5) was false
            // Pre-increment x
            ++x;

            // Prints the updated value of x
            System.out.println(x);

        }
        // Condition of do-while
        // Pre-increment x, then compare with 10
        // If true, loop repeats
        while (++x < 10);

        // Loop terminates when (++x < 10) becomes false
    }
}
