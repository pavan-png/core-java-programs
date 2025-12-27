public class If_Else_1 {
    public static void main(String[] args) {

        String a = "hello";
        String b = "hi";

        /*
         The condition uses `==` to compare Strings.

         IMPORTANT RULE:
         ---------------
         `==` compares REFERENCES (memory addresses),
         NOT the actual content of the String.

         "hello" and "Hello" are different in:
         - content (case-sensitive)
         - and reference

         So this condition evaluates to FALSE.
        */
        if (a == "Hello") {

            // This block will NOT execute
            System.out.println("hello Pavan");

        } else {

            /*
             Since the if-condition is false,
             the else block executes.
            */
            System.out.println("hi pavan");
        }
    }
}
