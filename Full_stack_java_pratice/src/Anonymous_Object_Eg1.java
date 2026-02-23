public class Anonymous_Object_Eg1 {

    // Instance variable (belongs to object)
    // Default value would be 0, but here we initialize it to 81
    int squares = 81;

    public static void main(String[] args) {

        // Anonymous object creation
        // We are not storing the reference in any variable
        // Object is created and go() method is called immediately
        new Anonymous_Object_Eg1().go();
    }

    void go() {

        // ++squares → pre-increment
        // First increases instance variable from 81 to 82
        // Then passes 82 to incr() method

        incr(++squares);

        // After incr() completes,
        // instance variable 'squares' remains 82
        // because Java uses pass-by-value

        System.out.println(squares); // Output: 82
    }

    void incr(int squares) {

        // This 'squares' is a local variable (method parameter)
        // It is different from instance variable
        // It receives a copy of value (82)

        squares += 10;

        // Now local variable becomes 92
        // But this change does NOT affect instance variable
        // Because Java passes primitive values by value (copy)
    }
}