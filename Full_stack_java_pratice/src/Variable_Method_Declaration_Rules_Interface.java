// Interface demonstrating all variable and method types
interface Variable_Check {

    // ==========================
    // Interface Variables
    // (All are public static final automatically)
    // ==========================

    int A = 10;                       // public static final
    public int B = 20;                // public static final
    static int C = 30;                // public static final
    final int D = 40;                 // public static final
    public static final int E = 50;   // explicitly written

    // ==========================
    // Abstract Method
    // (Automatically public abstract)
    // ==========================

    void abstractMethod();

    // ==========================
    // Default Method (Java 8+)
    // Must have body
    // Can be overridden
    // ==========================

    default void defaultMethod() {
        System.out.println("Inside default method");
        privateHelper();   // calling private method
    }

    // ==========================
    // Static Method (Java 8+)
    // Must have body
    // Cannot be overridden
    // ==========================

    static void staticMethod() {
        System.out.println("Inside static method");
        privateStaticHelper();
    }

    // ==========================
    // Private Method (Java 9+)
    // Must have body
    // Used only inside interface
    // ==========================

    private void privateHelper() {
        System.out.println("Inside private helper method");
    }

    private static void privateStaticHelper() {
        System.out.println("Inside private static helper method");
    }
}


// Implementation Class
class ImplementationClass implements Variable_Check {

    // Implementing abstract method (compulsory)
    @Override
    public void abstractMethod() {
        System.out.println("Implementing abstract method");

        // Accessing interface variables
        System.out.println("A = " + A);
        System.out.println("B = " + B);
        System.out.println("C = " + C);
        System.out.println("D = " + D);
        System.out.println("E = " + E);
    }

    // Overriding default method (optional)
    @Override
    public void defaultMethod() {
        System.out.println("Overridden default method");
    }
}


// Main Class
public class Variable_Method_Declaration_Rules_Interface {

    public static void main(String[] args) {

        ImplementationClass obj = new ImplementationClass();

        // Calling abstract method
        obj.abstractMethod();

        // Calling default method
        obj.defaultMethod();

        // Calling static method (must use interface name)
        Variable_Check.staticMethod();

        // Accessing variables using interface name
        System.out.println("Accessing constant using interface: " + Variable_Check.A);
    }
}
