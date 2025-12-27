public class For_Loop_Eg11 {
    public static void main(String[] args) {

        // Variable x is initialized with value 2
        int x = 2;

        // for loop starts
        // i starts from 0 and runs till i < 10
        for (int i = 0; i < 10; i++) {

            // This condition checks whether i is divisible by x (i % 2 == 0)
            // If true, continue is executed
            // continue skips the remaining code of this iteration
            // and moves control to the next iteration of the loop
            if (i % x == 0)
                continue;

            // This statement executes ONLY when i is NOT divisible by 2
            // (i.e., when i is an odd number)
            System.out.println(i);
        }

        // This statement is outside the loop
        // It prints the remainder when 4 is divided by 5
        System.out.println(4 % 5);
    }
}
