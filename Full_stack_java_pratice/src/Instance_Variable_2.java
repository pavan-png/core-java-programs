public class Instance_Variable_2 {

    // Instance variable (stored inside object in heap)
    int i = 10;

    // Driving code → JVM starts execution from main()
    public static void main(String[] args) {

        // System.out.println(i);
        // ❌ Compile-time error:
        // Cannot access instance variable directly from static context

        // Object creation
        // Heap memory is allocated and instance variable 'i' is initialized to 10
        Instance_Variable_2 obj = new Instance_Variable_2();

        // Reference variable 'obj' holds the reference (identity) of the heap object
        // Using the reference, we can access instance variables
        System.out.println(obj.i);
    }

    public void methodOne() {

        // Inside an instance method, instance variables can be accessed directly
        // because the method is invoked using an object
        System.out.println(i);
    }
}
