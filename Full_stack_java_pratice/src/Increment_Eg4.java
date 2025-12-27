public class Increment_Eg4 {
    final public static void main(String[] args) {

        int i = 5;

        // Condition: i++ < 6
        // i++ returns 5 (old value), then i becomes 6
        //
        // So condition becomes: 5 < 6   → true
        if (i++ < 6) {

            // Now inside the if-block, i is already 6
            //
            // i++ prints the OLD value (6), then i becomes 7
            System.out.println(i++);
        }
    }
}
