// 1. Class A (Grandparent)
class A_2 {
    public void methodA() {
        System.out.println("Method from Class A (Grandparent)");
    }
}

// 2. Class B (Parent)
// Part of Multilevel: B extends A
// Parent of Hierarchical: B is parent to both C and D
class B_2 extends A_2 {
    public void methodB() {
        System.out.println("Method from Class B (Parent)");
    }
}

// 3. Class C (Child 1)
// Part of Multilevel: C extends B (which extends A)
class C_2 extends B_2 {
    public void methodC() {
        System.out.println("Method from Class C (Child 1)");
    }
}

// 4. Class D (Child 2)
// Part of Hierarchical: D also extends B
class D_2 extends B_2 {
    public void methodD() {
        System.out.println("Method from Class D (Child 2)");
    }
}

// Main class to test the implementation
public class Hybrid_Inheritance_Eg2 {
    public static void main(String[] args) {

        System.out.println("--- Testing Object C (Multilevel Path) ---");
        C_2 objC = new C_2();
        objC.methodA(); // Inherited from Grandparent
        objC.methodB(); // Inherited from Parent
        objC.methodC(); // Own method

        System.out.println("\n--- Testing Object D (Hierarchical Path) ---");
        D_2 objD = new D_2();
        objD.methodA(); // Inherited from Grandparent (via B)
        objD.methodB(); // Inherited from Parent (via B)
        objD.methodD(); // Own method
        // objD cannot access methodC(), because C is a sibling, not a parent.
    }
}