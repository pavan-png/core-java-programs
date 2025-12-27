public class For_Loop_Eg19 {
    public static void main(String[] args) {

        // Variable i is declared
        int i;

        // for loop starts
        // Initialization: i = 0
        // Condition: i < 6
        // Update: i++
        for (i = 0; i < 6; i++) {

            // Pre-increment is used here
            // ++i increments i FIRST, then compares with 3
            if (++i > 3)

                // continue skips the remaining part of this iteration
                // control goes to the update part of the for loop (i++)
                continue;

            // There is no code here, so if condition is false,
            // control directly goes to the update part
        }

        // After the loop terminates, this statement executes
        // ++i increments i first, then prints the value
        System.out.println(++i);
    }
}
