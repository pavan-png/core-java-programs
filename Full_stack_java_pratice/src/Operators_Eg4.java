public class Operators_Eg4 {
    public static void main(String[] args) {

        boolean status = true;

        /*
         The below statement is commented because it causes a COMPILE-TIME ERROR.

         System.out.println((status = false || status = true | status = false));

         Reason:
         -------
         Java operator precedence causes ambiguity here.

         Operators involved:
         -------------------
         =   (assignment)
         ||  (logical OR)
         |   (bitwise OR)

         The compiler tries to parse the expression as:
         status = (false || status = true | status = false)

         This creates an INVALID structure because:
         - Assignment (`=`) expects a complete boolean expression on RHS
         - Multiple assignments without proper parentheses
           confuse the compiler
         - Java does NOT allow such chained assignments
           mixed with logical operators without explicit grouping

         IMPORTANT RULE:
         ---------------
         If the SAME variable is reassigned multiple times
         inside a single conditional expression,
         EACH assignment MUST be enclosed in parentheses.

         Example (valid form):
         ---------------------
         (status = false) || (status = true) | (status = false)
        */

        /*
         Since the above line is commented,
         status is never modified.
        */
        System.out.println(status);   // prints true
    }
}
