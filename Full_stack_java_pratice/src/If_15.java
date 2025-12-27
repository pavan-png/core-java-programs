public class If_15 {
    public static void main(String[] args) {

        int x = 10;

        /*
         The below `continue` statement is commented because it causes
         a COMPILE-TIME ERROR.

         Reason:
         -------
         `continue` can be used ONLY inside:
         - loops (for, while, do-while)
         - LABELED loops

         NOTE:
         -----
         - `continue` is NOT allowed in a normal if-statement
         - `continue` is NOT allowed in a plain labeled block
         - Label must be attached to a LOOP, not just any block

         Hence:
         using `continue` inside `if` ❌ invalid
        */

        /*
        if (x == 10)
            continue;   // compile-time error
        */
    }
}
