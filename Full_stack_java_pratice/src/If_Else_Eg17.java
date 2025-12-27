public class If_Else_Eg17 {
    public static void main(String[] args) {

        int marks = 70;

        /*
         No curly braces used.
         So `if` controls ONLY the next single statement.
        */
        if (marks > 60)
            System.out.println("Congratulations ");

        // This line is NOT part of the if.
        // It executes regardless of the condition.
        System.out.println("you passed");

        /*
         `else` must be immediately attached to an `if`.
         Here, the `if` statement is already complete.
         So this `else` has no matching `if` → compile-time error.
        */

        /*
        else
            System.out.println("better luck next time ");
        */
    }
}
