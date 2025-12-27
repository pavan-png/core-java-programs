public class For_Loop_Eg17 {
    public static void main(String[] args) {

        // Two variables are initialized before entering the for loop
        int i = 0, j = 5;

        // for loop explanation:
        // Initialization part is empty because i and j are already initialized
        // Condition part is: (i < 3) && (j++ < 10)
        // Update part is empty; i is incremented inside the loop body
        for (; (i < 3) && (j++ < 10); ) {

            // At this point:
            // - (i < 3) was checked first
            // - j++ < 10 was checked using the OLD value of j
            // - After comparison, j has already been incremented

            // This prints the current values of i and j
            // Note: j is printed AFTER it was incremented in the condition
            System.out.println(" " + i + " " + j);

            // i is manually incremented inside the loop body
            // This acts as the update step of the for loop
            i++;
        }

        // This line executes after the loop terminates
        // It prints the final values of i and j after loop completion
        System.out.println("outer loop" + " " + i + " " + j);
    }
}
