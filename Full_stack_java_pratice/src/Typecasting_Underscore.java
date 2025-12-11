public class Typecasting_Underscore {
    public static void main(final String[] args) {

        /* From JDK 1.7, we can use "_" inside numeric literals.
           The compiler simply removes the underscores when generating
           the .class file. They are only for readability. */
        char c = 'Z';
        long l = 100_00L;     // becomes 10000
        int i = 9_2;          // becomes 92
        float f = 2.02f;
        double d = 10_0.35d;  // becomes 100.35

        /* char + int → int
           char promotes to int because byte/short/char always promote to int.
           int result is stored in long → this is implicit widening (int → long). */
        l = c + i;
        System.out.println(l);

        /* Expression: char * long * int * float
           Promotion chain:
           char → int
           int + long → long
           long → float
           float is the highest type in the expression.
           Final result = float.
           Storing float into float → no casting needed. */
        f = c * l * i * f;
        System.out.println(f);

        /* Expression: long + int + char
           char → int
           int + long → long
           Result type is long.
           long fits in float because float has a larger range.
           So storing long in float → implicit widening (long → float). */
        f = l + i + c;
        System.out.println(f);

        /* double → int
           Narrowing conversion required because double is bigger than int.
           Must use explicit type casting. */
        i = (int) d;
        System.out.println(i);

        /* double → float (or long in your assignment)
           Both float and long are smaller than double in terms of precision.
           Implicit conversion is NOT allowed.
           Explicit casting is required. */
        f = (float) d;
    }
}
