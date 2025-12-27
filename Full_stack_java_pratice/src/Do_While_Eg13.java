public class Do_While_Eg13 {
    public static void main(String[] args) {

        // x is initialized with value 5
        int x = 5;

        // do-while loop starts
        // IMPORTANT: do-while executes the body FIRST
        do {

            // Post-decrement is used here
            // 1) Current value of x is printed
            // 2) After printing, x is decremented
            // So first iteration prints 5, then x becomes 4
            System.out.println(x--);

        }
        // Condition is checked AFTER executing the body
        // Now x == 4
        // Condition: x == 0 → 4 == 0 → false
        // Since condition is false, loop terminates
        while (x == 0);

        // Loop ends here
    }
}
