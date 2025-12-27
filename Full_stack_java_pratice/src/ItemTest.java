public class ItemTest {

    // Instance variable
    // 'final' means this variable can be assigned ONLY ONCE
    // Memory for this variable is created inside the heap object
    // After assignment, JVM treats it as immutable for that object
    private final int id;

    public ItemTest(int id) {
        // Constructor is a valid place to assign a final instance variable
        // JVM allows this because the object is still under construction
        // This assignment initializes the final field exactly once
        this.id = id;
    }

    public void updateId(int newId) {

        // ❌ COMPILE-TIME ERROR
        // Reason (internal compiler workflow):
        // - Compiler already marked 'id' as final
        // - 'id' was assigned in the constructor
        // - Final instance variables cannot be reassigned
        // - JVM enforces immutability at compile time
        // - Method execution is NOT even allowed to reach runtime
      //  id = newId;
    }

    public static void main(String[] args) {

        // A new ItemTest object is created in heap
        // Constructor runs and assigns id = 42
        ItemTest fa = new ItemTest(42);

        // Method call is written by programmer,
        // but this line will NEVER execute at runtime
        // because compilation already fails due to final reassignment
        fa.updateId(69);

        // This line is unreachable because program does not compile
        System.out.println(fa.id);
    }
}
