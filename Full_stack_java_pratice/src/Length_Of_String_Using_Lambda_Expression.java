/*
 * Demonstration of Functional Interface and Lambda Expression
 * to calculate length of a String.
 */

@FunctionalInterface
interface String_len_1 {

    /*
     * Functional Interface Rule:
     * It must contain exactly one abstract method.
     * This method will be implemented using lambda expression.
     */
    int str_len(String s);
}

public class Length_Of_String_Using_Lambda_Expression {

    public static void main(String[] args) {

        /*
         * Lambda Structure:
         * Left side  -> parameter (s)
         * Right side -> method body (s.length())
         *
         * Since there is only one parameter:
         * - Parentheses are optional.
         *
         * Since body has single statement:
         * - Curly braces {} are omitted.
         * - return keyword is NOT used.
         *
         * Compiler automatically understands:
         * s is of type String (type inference).
         */

        String_len_1 obj = s -> s.length();

        /*
         * Lambda expression is executed only
         * when the abstract method is called.
         */
        System.out.println(obj.str_len("Hello there"));
    }
}