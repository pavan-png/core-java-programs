public class Do_While_Eg9 {
    public static void main(String[] args) {

        // Two variables are initialized
        int a = 10, b = 20;

        // do-while loop starts
        // IMPORTANT: In do-while, the body executes FIRST
        do {

            // This statement executes ONCE
            // because do-while guarantees at least one execution
            System.out.println("hello");

        }
        // Condition is checked AFTER executing the body
        // a > b → 10 > 20 → false
        // Since the condition is false, the loop terminates immediately
        while (a > b);

        // This statement is REACHABLE
        // because the loop has already terminated
        System.out.println("hi");
    }
}
