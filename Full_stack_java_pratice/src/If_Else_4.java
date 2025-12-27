import java.util.SortedMap;

public class If_Else_4 {
    final strictfp public static void main(String[] args) {

        int x = 20;

        /*
         The below if–else block is commented because it causes a COMPILE-TIME ERROR.

         Reason:
         -------
         `=` is the ASSIGNMENT operator, not a comparison operator.

         Expression:
         if (x = 20)

         What happens here:
         ------------------
         - `x = 20` assigns 20 to x
         - The result of an assignment expression is the assigned value (20)
         - 20 is an int, NOT a boolean

         Java rule:
         ----------
         The condition inside `if` MUST be boolean.

         Hence:
         if (x = 20)  ❌ invalid (int cannot be used as condition)

         Correct comparison operator should be:
         ==
        */

        /*
        if (x = 20) {
            System.out.println("hello");
        } else {
            System.out.println("hi");
        }
        */
    }
}
