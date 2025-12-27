public class If_Else_6 {
    final strictfp public static void main(String[] args) {

        boolean b = true;

        /*
         IMPORTANT TRICKY CASE:

         The condition uses `=` (assignment), NOT `==` (comparison).

         Step-by-step:
         -------------
         b = true   → assigns true to b
         The assignment expression itself evaluates to true

         Since the condition becomes TRUE,
         the `if` block always executes.

         This is VALID in Java because:
         - `b = true` results in a boolean value
         - `if` accepts only boolean expressions
        */
        if (b = true) {
            System.out.println("hello");
        } else {
            System.out.println("hi");
        }
    }
}
