public class Increment_Eg10 {
    public static void main(String[] args) {

        int vAr = 9;

        /*
         * Condition: vAr++ < 10
         *
         * Step-by-step:
         *
         * 1) vAr++ returns the OLD value (9)
         * 2) After returning 9, vAr becomes 10
         *
         * So the condition becomes:
         *
         *        9 < 10   → true
         *
         * Since the condition is TRUE, the 'if' block will execute.
         * The 'else' block will be ignored.
         *
         * Inside the if block:
         *      System.out.println(vAr + " Hello world");
         *
         * NOTE:
         * vAr is already incremented to 10 at this point.
         *
         * Therefore the output will be:
         *
         *      10 Hello world
         */
        if (vAr++ < 10) {
            System.out.println(vAr + " Hello world ");
        }
        else {
            // This block does NOT execute because condition is true.
            System.out.println(vAr + " Hello universe");
        }
    }
}
