public class Switch_Case_Eg7 {
    public static void main(String[] args) {

        byte x = 10;

        /*
         Expression: x + 1

         Type promotion rule:
         --------------------
         byte + int  →  int

         Even though `x` is byte, `1` is an int literal.
         So the result of (x + 1) is of type `int`.

         Therefore, the switch expression type is `int`,
         NOT `byte`.
        */
        switch (x + 1) {

            /*
             Case labels must be compile-time constants
             and compatible with the switch expression type (int).

             Since the switch type is int,
             these values are checked against int range,
             not byte range.
            */
            case 10:
                System.out.println("hello");
                break;

            case 100:
                System.out.println("hi");
                break;

            case 1000:
                System.out.println("bye");
                break;

        }
    }
}
