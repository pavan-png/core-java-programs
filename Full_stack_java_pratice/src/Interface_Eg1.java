// -----------------------------
// Interface = Contract
// -----------------------------
interface ISample {

    // Variables inside interface are by default:
    // public static final (constant)
    int VALUE = 100;   // compiler treats as: public static final int VALUE = 100;

    // Methods are by default:
    // public abstract
    void m1();   // compiler treats as: public abstract void m1();
    void m2();
}


// -----------------------------
// Another Interface (to show multiple implementation)
// -----------------------------
interface IExtra {
    void extraMethod();
}


// -----------------------------
// Abstract class implementing interface
// (If not all methods are implemented, class must be abstract)
// -----------------------------
abstract class PartialSample implements ISample {

    // Implementing only one method
    // So class must be abstract
    public void m1() {
        System.out.println("Partial implementation of m1");
    }

    // m2() is not implemented here
    // So child class must implement it
}


// -----------------------------
// Concrete class implementing interfaces
// -----------------------------
class SampleImpl extends PartialSample implements IExtra {

    // Overriding rule:
    // Must be public (cannot reduce visibility)
    @Override
    public void m2() {
        System.out.println("Hello this is method m2");
    }

    @Override
    public void extraMethod() {
        System.out.println("Hello from extra method");
    }
}


// -----------------------------
// Main Class
// -----------------------------
public class Interface_Eg1 {

    public static void main(String[] args) {

        // Loose Coupling:
        // Reference type is interface
        // Object type is implementation class
        ISample obj = new SampleImpl();

        obj.m1();   // calls implemented method
        obj.m2();

        // Accessing interface constant
        System.out.println("Interface constant VALUE = " + ISample.VALUE);

        // Multiple interface reference
        IExtra extra = new SampleImpl();
        extra.extraMethod();
    }
}
