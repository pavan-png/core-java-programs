public class Switch_Eg18 {
    public static void main(String[] args) {

        byte b = 100;

        /*
         The switch expression is of type `byte`.

         Java rule:
         ----------
         Case label values must be:
         - compile-time constants, AND
         - within the RANGE of the switch expression data type.
        */
        switch (b) {

            /*
             100 is an int literal by default,
             but its value is within the valid byte range (-128 to 127).

             Hence, this case label is VALID.
            */
            case 100:
                System.out.println("var is 100 ");

            /*
             This case is commented because it causes a COMPILE-TIME ERROR.

             Reason:
             -------
             200 is an int literal.
             Its value is OUTSIDE the byte range (-128 to 127).

             Therefore, it cannot be used as a case label
             when the switch expression type is byte.
            */
            /*
            case 200:
                System.out.println("var is 200 ");
            */
        }
    }
}
