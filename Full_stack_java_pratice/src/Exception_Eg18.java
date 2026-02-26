class Base_1 {

    // Step 1:
    // Parent method declares NullPointerException.
    // NullPointerException is an UNCHECKED exception
    // (it is a subclass of RuntimeException).
    // Compiler does NOT strictly enforce rules for unchecked exceptions.
    public void m1() throws NullPointerException {

        System.out.println("Base: m1()");
    }
}

class Derived_1 extends Base_1 {

    // Step 2:
    // Overriding parent method.
    // Here we declare RuntimeException (parent of NullPointerException).
    //
    // Normally for CHECKED exceptions:
    // Child cannot throw broader exception than parent.
    //
    // But this rule DOES NOT apply to UNCHECKED exceptions.
    //
    // Since RuntimeException is unchecked,
    // compiler does NOT check overriding restriction.
    //
    // So this is perfectly valid.
    public void m1() throws RuntimeException {

        System.out.println("Derived: m1()");
    }
}

public class Exception_Eg18 {

    public static void main(String[] args) {

        // Step 3:
        // Parent reference holding child object (polymorphism).
        Base_1 obj = new Derived_1();

        // Step 4:
        // Method call is decided at runtime.
        // JVM looks at the actual object (Derived_1),
        // not the reference type (Base_1).
        //
        // So Derived_1's m1() executes.
        obj.m1();
    }
}