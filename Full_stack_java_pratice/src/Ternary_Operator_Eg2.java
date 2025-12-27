public class Ternary_Operator_Eg2 {
    public static synchronized void main(String[] args) {

        /*
         Ternary operator syntax:
         condition ? expression_if_true : expression_if_false

         IMPORTANT RULE (very tricky):
         -----------------------------
         In a ternary operator, the result type is decided at COMPILE TIME.
         If both expressions are INT literals within the byte range,
         the compiler allows implicit narrowing.
        */

        /*
         (10 > 20) → false
         So the false part (40) is selected.

         30 and 40 are int literals by default,
         but both are within byte range (-128 to 127).

         Hence, assignment to byte is allowed.
        */
        byte b = (10 > 20) ? 30 : 40;

        /*
         (10 < 20) → true
         So the true part (30) is selected.

         Same rule applies here:
         both operands are int literals within byte range,
         so compiler allows assignment to byte.
        */
        byte c = (10 < 20) ? 30 : 40;

        /*
         Printing the final values.
        */
        System.out.println("b value is   " + b);
        System.out.println("c value is   " + c);
    }
}
