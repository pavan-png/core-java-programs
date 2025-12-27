public class If_Else_3 {
    final strictfp public static void main(String[] args) {

        int x = 10;

        /*
         The below if–else block is commented because it causes a COMPILE-TIME ERROR.

         Reason:
         -------
         In Java, the condition inside an `if` statement MUST be of type boolean.

         `x` is an int variable.
         Java does NOT allow implicit conversion from int to boolean.

         Unlike some languages (like C/C++),
         Java does NOT treat:
         - 0 as false
         - non-zero as true

         Hence:
         if (x)   ❌ invalid in Java
        */

        /*
        if (x) {
            System.out.println(x);
        } else {
            System.out.println("not a number");
        }
        */
    }
}
