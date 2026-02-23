/*
 * Demonstration of Lambda Expression
 * with single parameter and return value.
 */

@FunctionalInterface
interface Sayable {

    /*
     * Functional Interface Rule:
     * Only one abstract method must be present.
     * This method returns a String.
     */
    String say(String name);
}

public class Lambda_Expression_Eg2 {

    public static void main(String[] args) {

        /*
         * =========================================
         * Case 1: Single parameter with parentheses
         * =========================================
         *
         * - Even if there is only one parameter,
         *   parentheses ( ) can be used.
         * - Curly braces { } are used.
         * - Since braces are used, return keyword is mandatory.
         */

        Sayable s1 = (name) -> {
            return "Hello, " + name;
        };

        // Lambda executes when abstract method is called
        System.out.println(s1.say("Sonoo"));


        /*
         * =========================================
         * Case 2: Single parameter without parentheses
         * =========================================
         *
         * - If lambda has only one parameter,
         *   parentheses are optional.
         * - Curly braces are still used here,
         *   so return keyword is required.
         */

        Sayable s2 = name -> {
            return "Hello, " + name;
        };

        System.out.println(s2.say("Sonoo"));


        /*
         * =========================================
         * Industry Preferred Style
         * =========================================
         *
         * Since body has only one statement,
         * braces and return can be removed.
         *
         * Cleaner and more readable version:
         *
         * Sayable s3 = name -> "Hello, " + name;
         */
    }
}