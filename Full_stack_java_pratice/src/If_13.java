public class If_13 {
    public static void main(String[] args) {

        // Wrapper Boolean (auto-boxed)
        Boolean b1 = true;

        // Primitive booleans
        boolean b2 = false;
        boolean b3 = true;

        /*
         Expression:
         ( b1 & b2 ) | ( b2 & b3 ) & b3

         Rules used:
         - & and | on booleans do NOT short-circuit
         - & has higher precedence than |

         Evaluation:
         (b1 & b2)        → true & false  → false
         (b2 & b3)        → false & true  → false
         (false & b3)     → false
         (false | false)  → false

         Result → false
         Hence, if block is NOT executed.
        */
        if ((b1 & b2) | (b2 & b3) & b3)
            System.out.println("alpha");

        /*
         Expression:
         b1 = false | ( b1 & b3 ) | ( b1 | b2 )

         ⭐ VERY IMPORTANT RULE:
         ----------------------
         In an assignment expression,
         the RHS is evaluated COMPLETELY using the OLD values,
         and ONLY AFTER THAT the result is assigned to the LHS variable.

         Evaluation using OLD values:
         (b1 & b3)  → true & true  → true
         (b1 | b2)  → true | false → true

         false | true | true → true

         Final step:
         b1 = true

         Since the assignment expression evaluates to true,
         the if-condition becomes TRUE.
        */
        if (b1 = false | (b1 & b3) | (b1 | b2))
            System.out.println("beta");
    }
}
