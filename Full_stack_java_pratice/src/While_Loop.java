public class While_Loop {
    public static void main(String[] args) {

        // Variable 'i' is initialized before the while loop
        // This acts as the starting point
        int i = 0;

        // while loop syntax:
        // The condition (i <= 10) is checked BEFORE every iteration
        while (i <= 10) {

            // This statement executes only if the condition is true
            // It prints the current value of i
            System.out.println(i);

            // Update step:
            // i is incremented so that the loop can eventually terminate
            i++;
        }

        // When i becomes 11, the condition (i <= 10) becomes false
        // Control exits the loop and program ends
    }
}
