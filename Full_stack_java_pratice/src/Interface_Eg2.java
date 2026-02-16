// -----------------------------
// 1️⃣ Interface (100% Abstraction)
// -----------------------------
// Interface defines the contract (service requirement).
// All methods are public and abstract by default.
// No implementation is provided here.

interface ISample_1 {

    void m1();   // public abstract by default
    void m2();
}


// -----------------------------
// 2️⃣ Abstract Class (Not 100% Abstraction)
// -----------------------------
// This class implements the interface.
// It provides partial implementation.
// Since not all methods are implemented,
// this class must be declared as abstract.

abstract class Sample_1Impl implements ISample_1 {

    @Override
    public void m1() {
        System.out.println("this is method m1");
    }

    // m2() is not implemented here.
    // So this class remains abstract.
}


// -----------------------------
// 3️⃣ Concrete Class (No Abstraction)
// -----------------------------
// This class extends the abstract class.
// It must implement the remaining abstract methods.
// Now this class becomes fully concrete (can create object).

class Sub_Sample_Impl extends Sample_1Impl {

    @Override
    public void m2() {
        System.out.println("this is method m2");
    }
}


// -----------------------------
// 4️⃣ Main Class (Developer’s Approach)
// -----------------------------
public class Interface_Eg2 {

    public static void main(String[] args) {

        // ✅ Good Approach (Loose Coupling)
        // Reference type = Interface
        // Object type = Concrete class
        // This allows flexibility and polymorphism.

        ISample_1 obj = new Sub_Sample_Impl();
        obj.m1();
        obj.m2();

        // ❌ Not Recommended Approach (Tight Coupling)
        // Sample_1Impl obj = new Sub_Sample_Impl();
        // Here reference depends on implementation class.
    }
}
