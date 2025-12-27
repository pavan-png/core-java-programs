public class While_Loop_Eg1 {
    public static void main(String[] args) {

        // while loop with condition 'true'
        // 'true' is a boolean literal
        // This condition NEVER becomes false
        while (true) {

            // Since the condition is always true,
            // this statement keeps executing again and again
            System.out.println("infinite loop");

            // There is NO update or break statement here
            // So control goes back to the while condition again
        }

        // This line is never reached
        // because the loop never terminates
    }
}
