public class Increment_7 {
    final public static void main(String[] args) {

        boolean b = true;

        /*
         *  b++;    // ❌ Not allowed
         *
         *  Reason:
         *  Increment (++) and decrement (--) operators can be applied ONLY on:
         *      ✔ integer types (byte, short, int, long)
         *      ✔ floating-point types (float, double)
         *      ✔ character type (char)
         *
         *  They CANNOT be applied on:
         *      ❌ boolean
         *      ❌ String
         *      ❌ literals (like 5++)
         *      ❌ expressions (like ++(x+1))
         *
         *  Boolean has only two values: true and false.
         *  It cannot be increased or decreased like numbers.
         *  So boolean b++ is invalid in Java.
         */

        System.out.println(b);
    }
}
