public class Do_While_Eg7 {
    public static void main(String[] args) {

        // do-while loop starts
        // IMPORTANT: do-while executes the body FIRST
        do {

            // This statement executes ONCE
            // because do-while guarantees at least one execution
            System.out.println("hello");
        }
        // Condition is checked AFTER executing the body
        // 'false' is a boolean literal known at compile time
        // Since the condition is false, the loop terminates immediately
        while (false);

        // This statement is REACHABLE
        // because the do-while loop ends after one execution
        System.out.println("hi");
    }
}
