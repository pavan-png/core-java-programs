public class Method_Overloading_Eg2 {

    int result;
    // Instance variable to store result when using void method

    // Method 1:
    // Takes two int parameters
    // Returns the sum as int
    int add(int a, int b) {
        return a + b;
    }

    // Method 2:
    // Takes int and byte parameters
    // Does not return anything (void)
    // Stores the result in instance variable
    void add(int a, byte b) {
        result = a + b;
    }

    public static void main(String[] args) {

        Method_Overloading_Eg2 obj = new Method_Overloading_Eg2();

        // Method call with arguments (20, 30)
        // Both arguments are int literals
        // Compiler looks for add(int, int)
        // It does NOT consider return type at all
        obj.add(20, 30);
    }
}
