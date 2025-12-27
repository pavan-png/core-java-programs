public class For_Loop {
    public static void main(String[] args) {

        // Declaration of loop control variable
        int i;

        // for loop structure
        // Step 1: Initialization  -> i = 1 (runs only once)
        // Step 2: Condition check -> i <= 5 (checked before every iteration)
        // Step 4: Update          -> i++ (executes after loop body)
        for (i = 1; i <= 5; i++) {

            // Step 3: Loop body
            // This statement executes only when condition is true
            // Prints the current value of i
            System.out.println(i);
        }

        // When i becomes 6, condition (i <= 5) becomes false
        // Loop terminates and control comes out of the for loop
    }
}
