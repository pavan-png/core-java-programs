public class Increment_Eg5 {
    final public static void main(String[] args) {

        int x = 4;

        /*
         * int y = 5++;   // ❌ Not allowed
         *
         * Reason:
         * Increment operators (++ or --) can be applied ONLY on variables.
         *
         * A literal like 5 is a constant value, not a variable.
         * Constants cannot change their value, so you cannot increment them.
         *
         * Valid example:
         * int y = x++;   // ✔ allowed because x is a variable
         */

        System.out.println(x);
    }
}
