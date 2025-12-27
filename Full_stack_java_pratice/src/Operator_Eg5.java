public class Operator_Eg5 {
    public static void main(String[] args) {

        boolean flag1 = true;
        boolean flag2 = false;
        boolean flag3 = true;
        boolean flag4 = false;

        /*
         EXPRESSION 1:
         -------------
         !flag1 == flag2 != flag3 == !flag4

         Operator rules used:
         --------------------
         - ! (NOT) has HIGHEST precedence
         - == and != have SAME precedence
         - == and != are evaluated LEFT TO RIGHT

         Step-by-step evaluation:

         !flag1        → !true  → false
         !flag4        → !false → true

         Now expression becomes:
         false == flag2 != flag3 == true

         Replace variables:
         false == false != true == true

         Left-to-right evaluation:
         -------------------------
         false == false  → true
         true != true    → false
         false == true   → false

         Final result → false
        */
        System.out.println(!flag1 == flag2 != flag3 == !flag4);

        /*
         EXPRESSION 2:
         -------------
         flag1 = flag2 != flag3 == !flag4

         IMPORTANT RULE:
         ---------------
         In assignment expressions,
         the RHS is evaluated COMPLETELY first,
         using OLD values, and only then
         the result is assigned to the LHS variable.

         Step-by-step RHS evaluation:

         !flag4        → !false → true
         flag2 != flag3 → false != true → true
         true == true   → true

         RHS result → true

         Final assignment:
         flag1 = true

         The assignment expression itself
         evaluates to true.
        */
        System.out.println(flag1 = flag2 != flag3 == !flag4);
    }
}
