public class If_Else_Eg18 {
    public static void main(String[] args) {

        int grade = 60;

        /*
         The below if–else block is commented because it causes
         a COMPILE-TIME ERROR.

         Reason:
         -------
         The condition uses `=` (assignment), not `==` (comparison).

         Expression:
         if (grade = 60)

         What happens:
         -------------
         - `grade = 60` assigns 60 to grade
         - the assignment expression evaluates to 60
         - 60 is an int, NOT a boolean

         Java rule:
         ----------
         `if` conditions MUST be boolean expressions.

         Hence:
         if (grade = 60) ❌ invalid
        */

        /*
        if (grade = 60)
            System.out.println("you have passed");
        else
            System.out.println("better luck next time");
        */
    }
}
