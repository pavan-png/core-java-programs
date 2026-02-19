public class Interface_Eg5 {

    /*
     * An interface can be declared inside a class.
     * Such an interface is called a nested interface.
     *
     * It behaves like a normal interface.
     */

    interface lambda_Function {

        /*
         * This is the Single Abstract Method (SAM).
         * Lambda expressions will bind to this method.
         */
        int apply(int j);


        /*
         * equals() looks like another abstract method,
         * but it is actually declared in java.lang.Object.
         *
         * All interfaces implicitly have access to Object class methods:
         *    equals()
         *    hashCode()
         *    toString()
         *
         * Since equals() already has a public implementation
         * in Object class, it is NOT counted as an abstract
         * method for functional interface calculation.
         *
         * Therefore, this interface still has only ONE
         * abstract method (apply).
         */
        boolean equals(java.lang.Object arg0);
    }

    public static void main(String[] args) {

        /*
         * Since lambda_Function has exactly ONE abstract method (apply),
         * it is considered a Functional Interface.
         *
         * Lambda expressions always bind to the Single Abstract Method (SAM).
         */

        Interface_Eg5.lambda_Function obj = (i) -> {
            i = i * i;
            return i;
        };

        /*
         * The above lambda can be simplified as:
         *
         * Interface_Eg5.lambda_Function obj = i -> i * i;
         */

        System.out.println(obj.apply(10));  // Output: 100
    }
}
