public class Ternary_Operator_Eg5 {
    public static void main(String[] args) {

        /*
         boolean flag = !true;
         !true → false
         So, flag = false
        */
        boolean flag = !true;

        /*
         Ternary expression:
         -------------------
         !flag ? args[0] : args[1]

         Step 1:
         flag = false
         !flag = true

         Step 2:
         Since condition is TRUE,
         the TRUE part of ternary is selected → args[0]

         IMPORTANT:
         ----------
         - args is the command-line arguments array
         - args[0] means first command-line argument
         - args[1] means second command-line argument
         - Program will throw ArrayIndexOutOfBoundsException
           if required arguments are not passed.
        */
        System.out.println(!flag ? args[0] : args[1]);
    }
}
