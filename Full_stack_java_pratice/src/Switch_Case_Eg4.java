public class Switch_Case_Eg4 {
    public static void main(String[] args) {

        int x = 10;

        // `y` is a local final variable.
        // Since it is initialized with a constant value,
        // the compiler knows its value at compile time.
        // Hence, `y` is treated as a COMPILE-TIME CONSTANT.
        final int y = 20;

        /*
         The switch expression can take a variable.
         Here, `x` is a local variable and is allowed in switch().
        */
        switch (x) {

            /*
             Literal value.
             Literals are always compile-time constants,
             so this case label is valid.
            */
            case 10:
                System.out.println("hello");
                break;

            /*
             `y` is a final local variable initialized with a constant.
             The compiler replaces `y` with its value (20) at compile time.
             Therefore, this case label is also VALID.
            */
            case y:
                System.out.println("hi");
                break;
        }
    }
}
