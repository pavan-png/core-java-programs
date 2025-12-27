public class Switch_Case_Eg10 {
    public static void main(String[] args) {

        /*
         Try changing the value of x to 0, 1, or 2
         to observe different execution flows.
        */
        int x = 0;

        /*
         Important rule:
         ---------------
         The `default` label can appear ANYWHERE inside a switch block.
         Its position does NOT matter.

         Execution rule:
         ---------------
         - Control jumps to the MATCHING case.
         - If no case matches, control jumps to `default`.
         - From that point, execution continues downward
           until a `break` is encountered.
        */
        switch (x) {

            /*
             `default` is executed ONLY if no case matches.
             However, since there is NO break here,
             execution will fall through to the next case.
            */
            default:
                System.out.println("default");

            /*
             This case matches when x == 0.
             Since x is 0 here, control comes directly to this case,
             NOT to default.
            */
            case 0:
                System.out.println("0");
                break;   // stops further execution

            /*
             This case executes only when x == 1.
             There is NO break here, so fall-through occurs.
            */
            case 1:
                System.out.println("1");

            /*
             This case executes when:
             - x == 2, OR
             - fall-through happens from case 1
            */
            case 2:
                System.out.println("2");
        }
    }
}
