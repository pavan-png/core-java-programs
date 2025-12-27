public class If_Else_11 {
    final strictfp public static void main(String[] args) {

        /*
         The `if` condition is true,
         so the block executes.

         Variable `x` is declared INSIDE the if-block.
         Its scope is LIMITED to this block only.

         After the closing brace of the if-block,
         `x` is out of scope and cannot be accessed.
        */
        if (true) {
            int x = 10;
        }

        /*
         If we try to use `x` here,
         it will cause a COMPILE-TIME ERROR
         because `x` is not visible outside the if-block.
        */
    }
}
