public class For_Loop_Eg16 {
    public static void main(String[] args) {

        // for loop starts with initialization
        // i is created and initialized with value 0
        for (int i = 0; i++ < 5; i++) {

            // At the start of each iteration, the condition i++ < 5 is evaluated
            // i++ returns the old value of i for comparison
            // After comparison, i is incremented

            // This line prints "Hello" whenever the loop body executes
            System.out.println("Hello");

            // i = i++ :
            // 1) i++ returns the current value of i
            // 2) i is incremented internally
            // 3) assignment sets i back to the old value
            // Result: increment is lost and i remains unchanged
            i = i++;

            // Prints the current value of i after assignment
            System.out.println(i);

            // After the loop body finishes, the update expression runs
            // i++ increments i by 1 before the next condition check
        }

        // Loop terminates when the condition i++ < 5 becomes false
    }
}
