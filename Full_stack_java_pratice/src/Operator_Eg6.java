public class Operator_Eg6 {
    public static void main(String[] args) {

        int score = 95;
        char grade = 'P';

        /*
         The below if–else ladder is commented because it causes
         COMPILE-TIME ERRORS.

         EXACT condition written by you:
         -------------------------------
         if (50 <= score) < 60)

         There are TWO problems here.
        */

        /*
         ❌ PROBLEM 1: Parenthesis grouping

         (50 <= score) is evaluated FIRST.

         50 <= 95 → true

         So after evaluation, the expression becomes:
         true < 60

         Now Java tries to compare:
         boolean < int
        */

        /*
         ❌ PROBLEM 2: Invalid comparison

         Relational operators (<, >, <=, >=) work ONLY on numeric types.
         A boolean value CANNOT be compared with an int.

         So:
         true < 60 ❌ compile-time error
        */

        /*
         Hence this line is INVALID:
         if (50 <= score) < 60)

         Same logical issue applies to:
         60 <= score < 70
         70 <= score < 80

         Java does NOT support chained comparisons.
         Each comparison must result in a complete boolean expression.
        */

        /*
        if (50 <= score) < 60)
            grade = 'D';
        else if (60 <= score < 70)
            grade = 'C';
        else if (70 <= score < 80)
            grade = 'B';
        else
            grade = 'A';
        */
    }
}
