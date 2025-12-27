public class Switch_Case_Eg_11 {
    public static void main(String[] args) {

        int x = 0;

        /*
         The switch expression is `x`.

         Value of x = 0,
         so control jumps directly to `case 0`.
        */
        switch (x) {

            /*
             case 0 matches.

             "hello" is printed.
             `break` is present, so execution stops here.
             Remaining cases are NOT executed.
            */
            case 0:
                System.out.println("hello");
                break;

            /*
             This case executes ONLY when x == 1.
             Since x is 0, this case is skipped.
            */
            case 1:
                System.out.println("hi");
        }
    }
}
