public class Increment_Eg3 {
    final public static void main(String[] args) {

        int a = 20;

        // Expression: --a * a++ + a-- - --a
        //
        // Java evaluates from LEFT to RIGHT.
        //
        // STEP 1: --a
        // a becomes 19, returns 19
        //
        // STEP 2: a++        (right side of *)
        // returns 19 (old value), then a becomes 20
        //
        // So far: (--a * a++) = 19 * 19 = 361
        // a = 20 now
        //
        // STEP 3: a--        (right side of +)
        // returns 20 (old value), then a becomes 19
        //
        // Expression now: 361 + 20
        // a = 19
        //
        // STEP 4: --a        (right side of -)
        // a becomes 18, returns 18
        //
        // Final expression:
        // value = 361 + 20 - 18 = 363
        //
        // Final a = 18
        int value = --a * a++ + a-- - --a;

        // Final value of a after all increments/decrements
        System.out.println("a = " + a);      // prints 18

        // Final result of the expression
        System.out.println("value = " + value);  // prints 363
    }
}
