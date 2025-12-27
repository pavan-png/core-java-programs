public class For_Loop_Eg2 {
    public static void main(String[] args) {

        // Wrapper Integer objects initialized to 0
        Integer x = 0;
        Integer y = 0;

        // for loop:
        // z is a Short wrapper type
        // Initialization: z = 0
        // Condition: z < 5
        // Update: z++ (auto-unboxing, increment, boxing)
        for (Short z = 0; z < 5; z++)

            // if condition uses OR (||) operator
            // (++x > 2) is evaluated first
            // (++y > 2) is evaluated ONLY IF first condition is false
            if ((++x > 2) || (++y > 2))

                // This executes only when if-condition is true
                x++;

        // Print final values of x and y
        System.out.println("x = " + x + "  y = " + y);
    }
}
