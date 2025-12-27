public class Do_While {
    public static void main(String[] args) {

        // Variable 'i' is initialized with value 10
        int i = 10;

        // do-while loop starts
        // IMPORTANT: In do-while, the body executes FIRST
        do {

            // This statement executes unconditionally
            // It prints the current value of i
            System.out.println(i);

            // Update step
            // i is incremented after printing
            i++;

        }
        // Condition is checked AFTER executing the body
        // Here: i <= 5 → 11 <= 5 → false
        while (i <= 5);

        // Since the condition is false,
        // the loop terminates immediately after one execution
    }
}
