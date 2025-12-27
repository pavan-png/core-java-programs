public class Ternary_Operator_Eg3 {
    public static synchronized void main(String[] args) {

        int a = 10, b = 20;

        /*
         The below code is commented because it causes a COMPILE-TIME ERROR.

         byte c = (a > b) ? 30 : 40;
         byte d = (a < b) ? 30 : 40;

         Reason:
         -------
         Here, `a` and `b` are VARIABLES (operands), not constants.

         Rule 1:
         ------
         Numeric literals like 30 and 40 are treated as int by default.

         Rule 2:
         ------
         In a ternary operator, if operands (variables) are involved,
         the result type is promoted to the HIGHER data type.

         Since `a` and `b` are int,
         the entire ternary expression becomes int.

         Rule 3:
         ------
         An int result CANNOT be assigned to a byte variable
         without explicit casting.

         Hence:
         byte c = (a > b) ? 30 : 40;  ❌ compile-time error
        */

        /*
         IMPORTANT COMPARISON RULES (note-ready):

         1) If ONLY number literals are used:
            - Compiler checks whether the literal value
              fits into the LHS data type.
            - If it fits → allowed
            - If not → compile-time error

         2) If VARIABLES are used in the expression:
            - Result type becomes the higher data type
              among the operands.
            - LHS variable must be capable of holding that type.
        */

        int e = 20;
        int f = 34;

        // No ternary used here, just normal int assignments
    }
}
