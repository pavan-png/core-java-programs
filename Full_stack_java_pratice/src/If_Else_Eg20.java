/*
public class If_Else_Eg20{

    public static void test(String str) {

        int check = 4;


         PROBLEMATIC LINE:
         -----------------
         if (check = str.length())

         Explanation:
         ------------
         1) `=` is the ASSIGNMENT operator, not comparison.
         2) str.length() returns an int.
         3) check = str.length() assigns that int value to `check`.
         4) The result of an assignment expression is the assigned value (int).
         5) `if` requires a BOOLEAN condition.

         Java does NOT allow int → boolean conversion.
         Hence, this line causes a COMPILE-TIME ERROR.
        */
     /*   if (check = str.length()) {


             This code is NEVER reached,
             because compilation already fails.

            System.out.print(str.charAt(check -= 1) + ", ");

        } else {


             This code is also NEVER reached.

            System.out.print(str.charAt(0) + ", ");
        }
    }

    public static void main(String[] args) {

        /*
         These method calls will NEVER execute
         because the program does not compile.


        test("four");
        test("tee");
        test("to");
    }
}
*/