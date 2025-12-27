public class Switch_Case_Eg8 {
    public static void main(String[] args) {

        int x = 97;

        /*
         The switch expression is of type `int`.

         Java rule:
         ----------
         Case labels must be compile-time constants
         and must be compatible with the switch expression type.

         `char` values are internally represented as integers
         (Unicode / ASCII values).
        */
        switch (x) {

            /*
             97 is an int literal.
             Since x == 97, this case matches and executes.
            */
            case 97:
                System.out.println("97");
                break;

            /*
             99 is also an int literal.
             This case is valid but will not execute
             because x is 97.
            */
            case 99:
                System.out.println("99");
                break;

            /*
             This case is commented only for explanation.

             'a' is a char literal.
             Internally, 'a' = 97 (ASCII / Unicode value).

             Since the switch expression type is int,
             char literals are allowed because they are
             automatically promoted to int.

             So:
             case 'a';  // VALID (value = 97)

             But it would cause a DUPLICATE CASE value error
             because case 97 already exists.
            */
            /*
            case 'a':
                System.out.println("100");
                break;
            */

            /*
             'w' is a char literal.
             Internally, 'w' = 119.

             Since 119 is an int value,
             this case label is VALID.
            */
            case 'w':
                System.out.println("w");
                break;
        }
    }
}
