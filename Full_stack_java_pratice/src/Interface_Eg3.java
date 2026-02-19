// Parent interface
interface DoNothing {

    /*
     * From Java 8 onwards, interfaces can contain:
     * 1) abstract methods (default behavior)
     * 2) default methods (concrete methods with implementation)
     * 3) static methods
     *
     * A default method must be declared using the keyword 'default'.
     * Otherwise, the method is treated as 'public abstract' by default.
     */

    default void doNothing() {
        System.out.println("do nothing");
    }
}


// Child interface
// This is intended to be a Functional Interface
interface DontDoAnything extends DoNothing {

    /*
     * Even though DoNothing provides a default implementation
     * of doNothing(), this interface redeclares it as abstract.
     *
     * By writing:
     *      public abstract void doNothing();
     *
     * we are overriding the default method and making it abstract again.
     *
     * Now this interface contains:
     * → Exactly ONE abstract method
     *
     * Therefore, it becomes a Functional Interface.
     *
     * (A functional interface = interface with exactly one abstract method)
     */

    public abstract void doNothing();
}


public class Interface_Eg3 {

    public static void main(String[] args) {

        /*
         * Lambda expressions are always mapped to
         * the SINGLE ABSTRACT METHOD (SAM) of a functional interface.
         *
         * Here:
         * DontDoAnything has exactly one abstract method:
         *      void doNothing();
         *
         * So the lambda expression implements that method.
         */

        DontDoAnything obj = () -> {
            System.out.println("I am idle");
        };

        /*
         * When obj.doNothing() is called,
         * the lambda implementation executes.
         *
         * The parent default method is NOT executed,
         * because we redeclared it as abstract in child interface.
         */

        obj.doNothing();
    }
}
