public class Switch_Case_Eg12 {
    public static void main(String[] args) {

        int a = 3;

        /*
         The switch expression is `a`.

         Initial value:
         a = 3

         Important rule:
         ---------------
         Control jumps directly to the MATCHING case.
         From there, execution continues downward
         until a `break` is encountered or the switch ends.
        */
        switch (a) {

            /*
             This case executes only if a == 1.
             Since a is 3, this case is SKIPPED.
            */
            case 1:
                ++a;

            /*
             This case executes only if a == 2
             OR via fall-through from case 1.
             Since a is 3, this case is SKIPPED.
            */
            case 2:
                a++;

            /*
             This case MATCHES because a == 3.

             ++a → pre-increment
             a becomes 4.

             No break is present,
             so execution FALLS THROUGH to default.
            */
            case 3:
                ++a;

            /*
             IMPORTANT:
             ----------
             `default` executes when:
             - no case matches, OR
             - execution falls into it due to missing break.

             Here, case 3 matched,
             but since there is NO break,
             default WILL EXECUTE.

             a++ → post-increment
             a becomes 5.
            */
            default:
                a++;
        }

        /*
         Final value of a = 5
        */
        System.out.println(a);
    }
}
