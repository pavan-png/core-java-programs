public class Increment_6 {
    final public static void main(String[] args) {

        int x = 4;

        /*
         *  int y = ++(++x);   // ❌ Not allowed
         *
         *  Reason:
         *  The ++ operator can be applied **only on variables**, not on results of expressions.
         *
         *  Inside ++(++x):
         *      - (++x) is an expression that produces a value.
         *      - It is NOT a variable after evaluation.
         *
         *  Since we cannot apply ++ on a value/expression,
         *  Java gives a compile-time error.
         *
         *  Valid example:
         *      ++x;         // ✔ OK
         *      int y = ++x; // ✔ OK
         *
         *  Invalid:
         *      ++(x + 1);   // ❌
         *      ++(++x);     // ❌
         */

        System.out.println(x);
    }
}
