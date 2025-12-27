public class For_Loop_Eg7 {
    public static void main(String[] args) {

        /*
         The below for-loop is commented because it causes
         a COMPILE-TIME ERROR.

         for (int i = 0; false; i++) {
             System.out.println("hello");
         }

         Explanation:
         ------------
         - The loop condition is the boolean literal `false`.
         - Boolean literals are evaluated by the compiler at COMPILE TIME.
         - Since the condition is ALWAYS false, the loop body will NEVER execute.

         Java compiler rule:
         -------------------
         If a loop condition is a boolean literal `false`,
         the loop body is considered DEFINITELY UNREACHABLE.

         Hence, the compiler reports an error saying
         the loop body is unreachable code.
        */

        /*
         This statement is outside the loop and is reachable.
         So it executes normally.
        */
        System.out.println("hi");
    }
}
