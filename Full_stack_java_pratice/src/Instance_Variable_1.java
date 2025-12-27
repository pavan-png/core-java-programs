public class Instance_Variable_1 {

    // Instance variables (stored inside object in heap)
    boolean b;      // default value: false
    char c;         // default value: '\u0000' (null character)
    int i = 10;     // explicitly initialized

    public static void main(String[] args) {

        // Reference variable 'obj' holds the identity (reference) of the heap object
        Instance_Variable_1 obj = new Instance_Variable_1();

        // Accessing instance variables using reference variable
        System.out.println(obj.b); // prints false
        System.out.println(obj.c); // prints blank (null character)
        System.out.println(obj.i); // prints 10
    }

    // Scope of reference variable 'obj' is only within the main() method.
    // Once execution leaves main(), the reference variable goes out of scope.
    // The object becomes eligible for garbage collection
    // IF no other references are pointing to it.
}
