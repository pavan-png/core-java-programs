public class Increment {
    public static void main(String[] args) {

        int a = 12;

        // Expression: a++ + a++ + a++
        //
        // Java evaluates from LEFT to RIGHT.
        //
        // Step 1: a++ → returns 12, then a becomes 13
        // Step 2: a++ → returns 13, then a becomes 14
        // Step 3: a++ → returns 14, then a becomes 15
        //
        // So the expression becomes:
        //       12   +   13   +   14  = 39
        //
        // After the full expression, a becomes 15.
        int d = a++ + a++ + a++;

        // Final value of a after all three post-increments
        System.out.println("value of a is " + a);   // prints 15

        // Value of the expression (sum of returned values)
        System.out.println("value of c is " + d);   // prints 39
    }
}
