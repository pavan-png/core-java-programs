class TestA {

    public void start() {
        // Parent class instance method
        // This method can be overridden by a child class
        System.out.println("parent class test method");
    }
}

public class Inheritance_Eg14 extends TestA {

    @Override
    public void start() {
        // Overridden method in child class
        // This method will be executed when runtime object is Inheritance_Eg14
        System.out.println("child class test method");
    }

    public static void main(String[] args) {

        // Step 1:
        // new Inheritance_Eg14() creates a CHILD object
        // Runtime object type is Inheritance_Eg14
        // Both parent and child parts exist in memory

        // Step 2:
        // (TestA) new Inheritance_Eg14() → UPCASTING
        // Reference type is TestA
        // Object type is Inheritance_Eg14

        // Step 3:
        // start() is an overridden INSTANCE method
        // Compiler allows the call based on reference type (TestA)
        // JVM decides which method to execute at runtime
        // Since runtime object is Inheritance_Eg14,
        // the CHILD class start() method is executed
        ((TestA) new Inheritance_Eg14()).start();
    }
}
