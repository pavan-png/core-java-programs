public class Switch_Case_Eg6 {
    public static void main(String[] args) {

        byte x = 20;

        /*
         The switch expression is of type `byte`.

         Java rule:
         ----------
         Case label values must be:
         - compile-time constants
         - AND within the RANGE of the switch expression data type
        */
        switch (x) {

            /*
             10 is an int literal by default,
             but its value is within the byte range (-128 to 127).

             Hence, the compiler allows this case.
            */
            case 10:
                System.out.println("hello");
                break;

            /*
             100 is also an int literal,
             but it is still within the byte range.

             So this case label is also VALID.
            */
            case 100:
                System.out.println("hi");
                break;

            /*
             This case is commented because it causes a COMPILE-TIME ERROR.

             Reason:
             -------
             1000 is an int literal.
             Its value is OUTSIDE the byte range (-128 to 127).

             Java does NOT allow case labels whose values
             exceed the range of the switch expression type.

             Therefore:
             case 1000; ❌ invalid for byte switch
            */
            /*
            case 1000:
                System.out.println("bye");
                break;
            */
        }
    }
}
