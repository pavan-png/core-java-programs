public class If_Else_5 {
    final strictfp public static void main(String[] args) {

        int x = 20;

        /*
         The condition uses the comparison operator `==`.

         Evaluation:
         -----------
         x == 20  → true

         Since the condition is TRUE,
         the `if` block is executed.

         The `else` block is skipped.
        */
        if (x == 20) {
            System.out.println("Hello");
        } else {
            System.out.println("Hi");
        }
    }
}
