public class For_Loop_Eg6 {
    public static void main(String[] args) {

        /*
         for-loop structure:
         -------------------
         for (initialization ; condition ; increment)

         Here:
         - initialization → int i = 0
         - condition      → true (boolean literal)
         - increment      → i++

         IMPORTANT:
         ----------
         The condition is the boolean literal `true`.
         This means the loop condition NEVER becomes false.

         Hence, this loop is an INFINITE LOOP.
        */
        for (int i = 0; true; i++) {
            System.out.println("hello");
        }

        /*
         The below statement is commented because it causes
         a COMPILE-TIME ERROR (unreachable code).
         boolean literal compiler will evaluate during compile time
         Reason:
         -------
         Since the for-loop condition is ALWAYS true,
         control will NEVER come out of the loop normally.

         Therefore, any statement written after this loop
         is considered DEFINITELY UNREACHABLE by the compiler.
        */

        /*
        System.out.println("hi");  // unreachable statement
        */
    }
}
