public class Do_While_Eg11 {
    public static void main(String[] args) {

        // a and b are declared as final
        // Their values are CONSTANT and known at COMPILE TIME
        final int a = 10, b = 20;

        // do-while loop starts
        // IMPORTANT: The body executes FIRST, at least once
        do {

            // This statement executes ONCE
            // because do-while guarantees one execution
            System.out.println("hello");

        }
        // Condition is checked AFTER executing the body
        // a > b → 10 > 20 → false
        // Since the condition is false, the loop terminates immediately
        while (a > b);

        // This statement is REACHABLE
        // because the do-while loop has already completed
        System.out.println("hi");
    }
}
