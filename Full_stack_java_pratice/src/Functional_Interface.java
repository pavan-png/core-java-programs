/*
 * Demonstration of all important Lambda Expression rules
 * and Functional Interface rules in one program.
 */

@FunctionalInterface
interface Add {

    // ✅ Only one abstract method (Functional Interface rule)
    int sum(int a, int b);

    // ✅ Default method allowed
    default void info() {
        System.out.println("Default method inside functional interface");
    }

    // ✅ Static method allowed
    static void help() {
        System.out.println("Static method inside functional interface");
    }
}

public class Functional_Interface {

    public static void main(String[] args) {

        /*
         * ==========================================
         * Rule 1: Structure of Lambda
         * Left side  -> parameters
         * Right side -> method body
         * ==========================================
         */

        // ✅ Data types are optional (compiler infers type)
        Add obj1 = (a, b) -> a + b;

        System.out.println("Sum (without data types): " + obj1.sum(10, 20));


        /*
         * ==========================================
         * Rule 2: If using {} braces,
         * return keyword is mandatory
         * ==========================================
         */

        Add obj2 = (int a, int b) -> {
            return a + b;     // return required because { } is used
        };

        System.out.println("Sum (with braces + return): " + obj2.sum(30, 40));


        /*
         * ==========================================
         * Rule 3: If body has single statement,
         * braces {} can be omitted
         * and return must NOT be written
         * ==========================================
         */

        Add obj3 = (a, b) -> a + b;

        System.out.println("Sum (single-line lambda): " + obj3.sum(50, 60));


        /*
         * ==========================================
         * Rule 4: Lambda executes only when
         * abstract method is called
         * ==========================================
         */

        // Lambda is not executed here:
        Add obj4 = (a, b) -> {
            System.out.println("Executing lambda...");
            return a + b;
        };

        // Lambda executes only now:
        System.out.println("Sum (execution demo): " + obj4.sum(5, 5));


        /*
         * ==========================================
         * Rule 5: Single parameter example
         * Parentheses are optional if only one parameter
         * ==========================================
         */

        @FunctionalInterface
        interface Square {
            int calculate(int x);
        }

        Square sq = x -> x * x;  // parentheses removed

        System.out.println("Square: " + sq.calculate(7));


        /*
         * ==========================================
         * Rule 6: No 'implements' keyword is used.
         * Lambda automatically provides implementation.
         * ==========================================
         */


        /*
         * ==========================================
         * Default and static methods demonstration
         * ==========================================
         */

        obj1.info();     // calling default method
        Add.help();      // calling static method
    }
}