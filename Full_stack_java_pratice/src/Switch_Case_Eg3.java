public class Switch_Case_Eg3 {
    public static void main(String[] args) {

        int x = 10;
        int y = 20;

        /*
         The switch expression can be:
         - a literal, OR
         - a variable, OR
         - a compile-time constant expression

         It must be compatible with the data type used in the case labels.
         Here, `10` is a literal, so it is valid.
        */
        switch (10) {

            /*
             Case labels must be:
             - literals, OR
             - compile-time constant expressions

             Literal values like 10 are always compile-time constants,
             so this case is valid.
            */
            case 10:
                System.out.println("hello");
                break;

            /*
             This case is commented because it causes a COMPILE-TIME ERROR.

             Reason:
             -------
             `y` is a normal variable.
             Variables are evaluated at runtime, not at compile time.

             Java rule:
             ----------
             Case labels CANNOT use:
             - non-final variables
             - runtime values

             Therefore:
             case y;  ❌ invalid (not a compile-time constant)
            */
            /*
            case y:
                System.out.println("hi");
            */
        }
    }
}
