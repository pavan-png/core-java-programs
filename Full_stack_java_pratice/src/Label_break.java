public class Label_break {
    public static void main(String[] args) {

        int x = 10;

        /*
         This is a LABELED BLOCK (not a loop).

         Java allows `break` with a label to exit:
         - loops
         - switch
         - labeled blocks
        */
        label: {
            System.out.println("begin");

            /*
             Condition check:
             x == 10 → true

             `break label;` immediately terminates
             the labeled block named `label`.

             Control jumps to the first statement
             AFTER the labeled block.
            */
            if (x == 10)
                break label;

            /*
             This line will NOT execute
             because the labeled block is already exited.
            */
            System.out.println("end");
        }

        /*
         Execution continues here after breaking
         out of the labeled block.
        */
        System.out.println("hello");
    }
}
