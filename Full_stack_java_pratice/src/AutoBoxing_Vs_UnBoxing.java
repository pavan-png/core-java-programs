public class AutoBoxing_Vs_UnBoxing {

    // --- Method Overloading ---
    // Java provides two versions of the m1 method. The compiler must decide which one to call.

    // Overload #1: Expects a wrapper class object (Long).
    public static void m1(Long l) {
        System.out.println("Method with Long parameter called.");
    }

    // Overload #2: Expects a primitive data type (long).
    public static void m1(long i) {
        System.out.println("Method with long primitive parameter called.");
    }

    public static void main(String[] args) {
        // A primitive integer.
        int x = 10;

        // An Integer wrapper class object. This is an example of AUTOBOXING
        // where the primitive value 20 is automatically converted into an Integer object.
        Integer y = 20;

        // --- Overload Resolution in Action ---

        // Case 1: Calling m1 with an Integer object.
        // The compiler evaluates the possible conversions for `m1(y)`:
        // 1. To `m1(Long l)`: This would require converting Integer -> Long. They are sibling classes, so this is not possible.
        // 2. To `m1(long i)`: This requires two steps:
        //    a. UNBOXING: The Integer `y` is converted to a primitive `int`.
        //    b. WIDENING: The primitive `int` is widened to a `long`.
        // This is a valid conversion path, so the compiler chooses m1(long i).
        System.out.print("Calling m1(y) where y is an Integer: ");
        m1(y);


        // Case 2: Calling m1 with a primitive int.
        // The compiler evaluates the possible conversions for `m1(x)`:
        // 1. To `m1(long i)`: This requires WIDENING the primitive `int` to a `long`. This is a direct and preferred conversion.
        // 2. To `m1(Long l)`: This would require WIDENING (`int` to `long`) and then BOXING (`long` to `Long`).
        //    Java does NOT allow widening and boxing in the same conversion step.
        //
        // Because a direct widening conversion to `long` is possible, the compiler chooses `m1(long i)`.
        System.out.print("Calling m1(x) where x is an int: ");
        m1(x);
    }
}

/*
 * --- Final Console Output ---
 * Calling m1(y) where y is an Integer: Method with long primitive parameter called.
 * Calling m1(x) where x is an int: Method with long primitive parameter called.
 */