public class String_Eg102 {
    public static void main(String[] args) {

        /*
         * final primitive variables with constant values
         * are treated as compile-time constants.
         */
        final int i1 = 1;
        final int i2 = 1;

        /*
         * final String literal is also a compile-time constant.
         * Stored in String Constant Pool (SCP).
         */
        final String s1 = ":One";

        /*
         * String literal "hello" is stored in SCP.
         * p1 points to the same SCP object.
         */
        String p1 = "hello";

        /*
         * == compares references.
         * Both p1 and "hello" refer to the SAME SCP object.
         */
        System.out.println(p1 == "hello"); // true

        /*
         * i1 + s1:
         * - i1 is final primitive
         * - s1 is final String
         * Both are compile-time constants.
         *
         * Expression is evaluated at COMPILE TIME.
         * Result "1:One" is placed in SCP.
         */
        String str1 = i1 + s1;

        /*
         * Same logic as above.
         * Compiler reuses the same SCP object "1:One".
         */
        String str2 = i2 + s1;

        System.out.println(str1); // 1:One
        System.out.println(str2); // 1:One

        /*
         * Both references point to the SAME SCP object.
         */
        System.out.println(str1 == str2); // true

        /*
         * "1:One" literal is already in SCP.
         * str1 also points to the same SCP object.
         */
        System.out.println(str1 == "1:One"); // true
        System.out.println(str2 == "1:One"); // true

        /*
         * NOTE (important correction):
         * It is NOT about primitives vs wrapper classes.
         * It is about whether the expression is a
         * COMPILE-TIME CONSTANT or a RUNTIME expression.
         */

        /*
         * Both operands are string literals.
         * Concatenation happens at COMPILE TIME.
         * Result "hellohi" is stored in SCP.
         */
        String s3 = "hello" + "hi";
        String s4 = "hello" + "hi";

        /*
         * Both s3 and s4 refer to the SAME SCP object.
         */
        System.out.println("s3==s4");
        System.out.println(s3 == s4); // true

        /*
         * concat() is a METHOD call.
         * Method calls are evaluated at RUNTIME.
         * New String objects are created in HEAP.
         */
        String s5 = "hi".concat("hello");
        String s6 = "hi".concat("hello");

        /*
         * Different heap objects → different references.
         */
        System.out.println(s5 == s6); // false
    }
}
