public class If_Else_7 {
    strictfp public static void main(String[] args) {

        boolean b = false;

        /*
         The condition uses the comparison operator `==`.

         Evaluation:
         -----------
         b == true  → false

         Since the condition is FALSE,
         the `if` block is skipped
         and the `else` block is executed.
        */
        if (b == true) {
            System.out.println("Hello");
        } else {
            System.out.println("hi");
        }
    }
}
