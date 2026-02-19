// Parent Interface A5
interface A5 {

    /*
     * Variables declared inside an interface are:
     * public + static + final  (by default)
     *
     * So they are constants.
     * Value MUST be assigned at the time of declaration.
     */

    String s = "hello";   // public static final String s = "hello";


    /*
     * From Java 8 onwards, interfaces can have:
     * - default methods (with implementation)
     * - static methods
     * - private methods (Java 9+)
     *
     * A concrete method inside interface MUST be declared as 'default'
     * (unless it is static or private).
     */

    default void method1() {
        System.out.println("pavan");
    }
}


// Empty Interface
interface B2 {
    /*
     * An interface can be empty.
     * Such interfaces are sometimes called marker interfaces
     * (if used to give special ability like Serializable).
     */
}


// Child Interface with Multiple Inheritance
/*
 * An interface can extend multiple interfaces.
 * This is how Java supports multiple inheritance.
 */
interface C extends A5, B2 {

    /*
     * Default methods from parent interfaces
     * can be overridden in child interface.
     *
     * Only ONE version of method1() will exist in C.
     * The overridden version replaces the parent version.
     */

    @Override
    default void method1() {
        System.out.println("hello");
    }


    /*
     * Overloading is allowed in interfaces.
     * This is a different method because parameter list is different.
     */

    public void method1(int x);


    /*
     * Important:
     * Interface methods cannot have:
     * - protected
     * - private (unless Java 9+ and only for non-abstract methods)
     *
     * Abstract methods in interface are always:
     * public + abstract (implicitly).
     */
}


// Implementation Class
public class Interface_Eg6 {

    public static void main(String[] args) {

        /*
         * No compilation error because:
         * - We are not creating an object of C.
         * - C has one abstract method (method1(int)).
         *
         * If a class implements C,
         * it MUST implement method1(int).
         */
    }
}
