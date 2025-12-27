public class If_Else_12 {
    public static void main(String args[]) {

        /*
         When curly braces are NOT used,
         an `if` statement controls ONLY ONE statement.

         Here:
         - `System.out.println("hello");` is part of the if
         - `System.out.println("hi");` is OUTSIDE the if
        */
        if (true)
            System.out.println("hello");

        // This statement executes independently of the if condition
        System.out.println("hi");
    }
}
