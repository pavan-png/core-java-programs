public class If_Else_10 {
    public static void main(String args[]) {

        /*
         The below code is commented because it causes a COMPILE-TIME ERROR.

         if (true)
             int x = 10;

         Reason:
         -------
         When curly braces are NOT used,
         an `if` statement can control ONLY ONE STATEMENT.

         A VARIABLE DECLARATION is NOT considered
         a valid standalone statement in this context.

         Java rule:
         ----------
         Without braces `{ }`,
         `if` can control only an executable statement,
         not a declaration.

         Correct ways:
         -------------
         1) Use braces:
            if (true) {
                int x = 10;
            }

         2) Or move declaration outside the if.
        */
    }
}
