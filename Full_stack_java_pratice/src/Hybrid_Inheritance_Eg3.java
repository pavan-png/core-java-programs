// 1. Class C (Root Parent)
// Top of the hierarchy
class C_3 {
    public void methodC() {
        System.out.println("Method from Class C (Root Parent)");
    }
}

// 2. Class A (Child of C)
// Part of Hierarchical Inheritance (Sibling to B)
// Parent to D
class A_3 extends C_3 {
    public void methodA() {
        System.out.println("Method from Class A (Child of C)");
    }
}

// 3. Class B (Child of C)
// Part of Hierarchical Inheritance (Sibling to A)
class B_3 extends C_3 {
    public void methodB() {
        System.out.println("Method from Class B (Child of C)");
    }
}

// 4. Class D (Child of A)
// Part of Single Inheritance (Extends A)
class D_3 extends A_3 {
    public void methodD() {
        System.out.println("Method from Class D (Child of A)");
    }
}

// Main class to demonstrate the logic
public class Hybrid_Inheritance_Eg3 {
    public static void main(String[] args) {

        System.out.println("--- Testing Object D (The Chain) ---");
        D_3 objD = new D_3();
        // D can access its own method
        objD.methodD();
        // D inherits from A
        objD.methodA();
        // D inherits from C (via A)
        objD.methodC();

        System.out.println("\n--- Testing Object B (The Sibling) ---");
        B_3 objB = new B_3();
        // B can access its own method
        objB.methodB();
        // B inherits from C
        objB.methodC();
        // B CANNOT access methodA() or methodD()
    }
}