public class For_Loop_Eg18 {
    public static void main(String[] args) {

        // for loop explanation:
        // Initialization: int i = 0
        // → loop starts with i = 0
        //
        // Condition: i < 10
        // → loop continues as long as i is less than 10
        //
        // Update: i += 2
        // → i is increased by 2 after each iteration
        // → this makes the loop skip odd numbers
        for (int i = 0; i < 10; i += 2) {

            // Prints the current value of i followed by a space
            // Since i increases by 2, only even numbers are printed
            System.out.print(i + " ");
        }

        // Loop stops when i becomes 10
        // Final output: 0 2 4 6 8
    }
}
