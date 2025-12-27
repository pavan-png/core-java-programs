public class Switch_Case_Eg5 {
    public static void main(String[] args) {

        int x = 10;
        byte b = 1;

        /*
         There is NO compile-time error here.

         Reason:
         -------
         The switch expression is `30`, which is an int literal.
         By default, integer literals are of type `int`.

         Case labels must be compatible with the switch expression type.
         Here, all case labels evaluate to `int`, so they are valid.
        */
        switch (30) {

            /*
             All case labels below are COMPILE-TIME CONSTANT EXPRESSIONS.

             10              -> literal
             20 + 10         -> compile-time constant expression
             10 + 20 + 30    -> compile-time constant expression

             Since there is NO `break` statement,
             execution will fall through from the first matching case
             to all subsequent cases.
            */
            case 10:
            case 20 + 10:
            case 10 + 20 + 30:
                // No statements inside the cases
                // and no break, so control simply falls through
        }
    }
}
