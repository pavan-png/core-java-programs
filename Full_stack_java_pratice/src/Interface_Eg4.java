// Parent Interface
interface Base {

    /*
     * From Java 8 onwards, interfaces can contain default methods.
     * Default methods have implementation and are inherited
     * by child interfaces and implementing classes.
     */

    default void foo() {
        System.out.println("this is base interface method");
    }

    default void foo_1() {
        System.out.println("this is base interface method");
    }
}


// Child Interface
interface Derived extends Base {

    /*
     * Default methods from parent interface CAN be overridden
     * inside a child interface.
     *
     * This is similar to method overriding in classes.
     *
     * Now, any class implementing Derived will use this
     * overridden version instead of Base's foo().
     */

    @Override
    default void foo() {
        System.out.println("this is derived interface method");
    }
}


// Another Interface
interface Another_Interface {

    /*
     * Static methods inside interfaces:
     *
     * - Belong to the interface itself.
     * - They are NOT inherited by implementing classes.
     * - They must be accessed using InterfaceName.methodName().
     */

    static void foo() {
        System.out.println("this is another interface static method");
    }
}


// Implementation Class
public class Interface_Eg4 implements Derived, Another_Interface {

    /*
     * Important Rule:
     * Interface static methods are NEVER inherited.
     *
     * So this class does NOT get foo() from Another_Interface.
     *
     * Only default methods are inherited.
     */

    public static void main(String[] args) {

        Interface_Eg4 obj = new Interface_Eg4();

        /*
         * Which foo() gets executed?
         *
         * Flow:
         * Base -> has default foo()
         * Derived -> overrides foo()
         * Interface_Eg4 implements Derived
         *
         * So Derived's foo() executes.
         */

        obj.foo();   // Calls Derived's overridden default method


        /*
         * If we want to call static method from Another_Interface,
         * we must use:
         */

        Another_Interface.foo();
    }
}
