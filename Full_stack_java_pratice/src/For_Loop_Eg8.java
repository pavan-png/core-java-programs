public class For_Loop_Eg8 {
    public static void main(String[] args) {

        /*
         for-loop structure:
         -------------------
         for (initialization ; condition ; increment)

         Here:
         - initialization → int i = 0
         - condition      → (missing)
         - increment      → i++

         Java rule:
         ----------
         If the condition part is omitted,
         Java treats it as ALWAYS TRUE.

         So this loop becomes an INFINITE LOOP.
        */
        for (int i = 0; ; i++) {
            System.out.println("hello");
        }

        /*
         The below statement is commented because it causes
         a COMPILE-TIME ERROR (unreachable code).

         Reason:
         -------
         Since the loop condition is implicitly TRUE,
         the loop never terminates normally.

         Therefore, any statement written after this loop
         is considered DEFINITELY UNREACHABLE by the compiler.
        */

        /*
        System.out.println("hi");  // unreachable code
        */
    }
}
