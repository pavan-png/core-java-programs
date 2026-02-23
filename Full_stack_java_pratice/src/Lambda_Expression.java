/*
 * Demonstration of Lambda Expression
 * showing:
 * 1) Without return keyword
 * 2) With return keyword
 */

@FunctionalInterface
interface Addable {

    /*
     * Functional Interface Rule:
     * Exactly one abstract method.
     * This method will be implemented using lambda expression.
     */
    int add(int a, int b);
}

public class Lambda_Expression {

    public static void main(String[] args) {

        /*
         * ===============================
         * Case 1: Lambda without return
         * ===============================
         *
         * - Parameter types are optional (type inference).
         * - Curly braces {} are omitted because body has single expression.
         * - return keyword must NOT be used when braces are omitted.
         *
         * Structure:
         * (parameters) -> expression
         */

        Addable ad1 = (a, b) -> (a + b);

        // Lambda executes when abstract method is called
        System.out.println("Sum (without return): " + ad1.add(10, 20));


        /*
         * ===============================
         * Case 2: Lambda with return
         * ===============================
         *
         * - Parameter types are explicitly mentioned (optional).
         * - Curly braces {} are used.
         * - When braces are used, return keyword is mandatory.
         *
         * Structure:
         * (parameters) -> {
         *      return value;
         * }
         */

        Addable ad2 = (int a, int b) -> {
            return (a + b);
        };

        // Lambda executes when abstract method is called
        System.out.println("Sum (with return): " + ad2.add(100, 200));
    }
}