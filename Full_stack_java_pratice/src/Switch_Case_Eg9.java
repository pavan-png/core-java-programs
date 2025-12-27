public class Switch_Case_Eg9 {
    public static void main(String[] args) {

        int a = 5;
        int x = 10;

        /*
         The switch expression is `x`, whose value is 10.

         Important rule:
         ---------------
         If a matching case is found and there is NO `break`,
         execution continues to all subsequent cases
         (this is called FALL-THROUGH).
        */
        switch (x) {

            /*
             case 10 matches because x == 10.

             a *= 2;
             This is a compound assignment.
             It means: a = a * 2;
             a becomes 5 * 2 = 10.

             No break here, so execution continues to next case.
            */
            case 10:
                a *= 2;

            /*
             This case executes due to fall-through.

             a *= 3;
             a becomes 10 * 3 = 30.

             Still no break, so execution continues.
            */
            case 20:
                a *= 3;

            /*
             This case also executes due to fall-through.

             a *= 4;
             a becomes 30 * 4 = 120.
            */
            case 30:
                a *= 4;
        }

        /*
         Final value of `a` after switch execution is 120.
        */
        System.out.println(" The value of a is  " + a);
    }
}
