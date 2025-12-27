public class If_Else_Eg19 {
    public static void main(String[] args) {

        int x = 5;

        /*
         The condition is the boolean literal `false`.

         IMPORTANT:
         ----------
         Even though the condition is ALWAYS false,
         the Java compiler does NOT treat the if-body
         as unreachable code.

         The compiler does NOT evaluate if/else logic
         for unreachable-code checking.
        */
        if (false)
            System.out.println(x);   // this line is skipped at runtime

        /*
         This statement is OUTSIDE the if.
         It always executes normally.
        */
        System.out.println("Hello");
    }
}
