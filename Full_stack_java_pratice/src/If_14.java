public class If_14 {
    public static void main(String[] args) {

        int a = 10;

        /*
         The below `break` statement is commented because it causes
         a COMPILE-TIME ERROR.

         Reason:
         -------
         `break` can be used ONLY inside:
         - loops (for, while, do-while)
         - switch statements
         - labeled blocks

         An `if` statement by itself is NOT a valid context for `break`.

         Hence:
         using `break` directly inside `if` ❌ invalid
        */
        if (a == 10)
            // break;   // compile-time error

        /*
         Since the `if` condition is true,
         this println statement executes.
        */
            System.out.println("hello");
    }
}
