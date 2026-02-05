class Aplha1 {

    public void foo() {
        // Parent class instance method
        // This method can be overridden
        System.out.println("method a");
    }
}

public class Inheritance_Eg15 extends Aplha1 {

    public void foo() { // overridden method
        // Child class version of foo()
        // This method overrides Aplha1.foo()
        System.out.println("method b");
    }

    public static void main(String[] args) {

        // Step 1:
        // Upcasting
        // Reference type → Aplha1
        // Runtime object → Inheritance_Eg15
        Aplha1 obj = new Inheritance_Eg15();

        // Step 2:
        // Downcasting
        // Same runtime object is now viewed using child reference
        // No new object is created here
        Inheritance_Eg15 obj1 = (Inheritance_Eg15) obj;

        /*
         IMPORTANT:
         - Overridden methods are always executed based on the RUNTIME object
         - Type casting changes only the REFERENCE TYPE, not the object
         - JVM looks at the actual object, not the reference, for method execution
        */

        // Step 3:
        // Method call using parent reference
        // JVM sees runtime object → Inheritance_Eg15
        // So child class method foo() is executed
        obj.foo();

        // Step 4:
        // Method call using child reference
        // Runtime object is still Inheritance_Eg15
        // Same overridden method is executed
        obj1.foo();
    }
}
