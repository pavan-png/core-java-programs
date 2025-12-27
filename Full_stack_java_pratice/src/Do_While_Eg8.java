public class Do_While_Eg8 {
    public static void main(String[] args) {

        // Two variables are initialized
        int a = 10, b = 20;

        // do-while loop starts
        // IMPORTANT: The body executes FIRST
        do {

            // This statement executes at least once
            System.out.println("hello");

        }
        // Condition is checked AFTER executing the body
        // a < b is evaluated at RUNTIME
        // Even though it is true now, the compiler does NOT treat it as constant
        while (a < b);

        // This statement is REACHABLE
        // Because the compiler cannot guarantee that the loop is infinite
        System.out.println("hi");
    }
}
