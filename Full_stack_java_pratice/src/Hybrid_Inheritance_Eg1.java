// 1. Class A (Grandparent Class)
class A_1 {
    public void displayA() {
        System.out.println("Method from Class A (Grandparent)");
    }
}

// 2. Class B (Parent Class)
// Represents "Single Inheritance" section (B extends A)
class B_1 extends A_1 {
    public void displayB() {
        System.out.println("Method from Class B (Parent)");
    }
}

// 3. Interface C
// Represents the interface part of the diagram
interface C_1 {
    // Interface methods are abstract by default
    void showC();
}

// 4. Class D (Child Class)
// Represents "Hybrid Inheritance": Extends Class B AND Implements Interface C
class D_1 extends B_1 implements C_1 {

    public void displayD() {
        System.out.println("Method from Class D (Child)");
    }

    // Must implement the method defined in Interface C
    @Override
    public void showC() {
        System.out.println("Method from Interface C");
    }
}

// Main class to test the implementation
public class Hybrid_Inheritance_Eg1 {
    public static void main(String[] args) {
        // Create an object of Class D
        D_1 obj = new D_1();

        System.out.println("--- Hybrid Inheritance Output ---");

        // D can access method from Grandparent A (Inheritance chain)
        obj.displayA();

        // D can access method from Parent B (Single Inheritance)
        obj.displayB();

        // D can access its own method
        obj.displayD();

        // D accesses the implemented method from Interface C
        obj.showC();
    }
}