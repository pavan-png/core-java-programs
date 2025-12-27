public class Local_Final_Variable_2 {

    public static void main(String[] args) {

        final int b;
        // b is a final local variable
        // It is declared but NOT initialized
        // A final local variable must be initialized before it is used

        final int a = 10;
        // a is a final local variable
        // It is initialized at the time of declaration
        // Once assigned, its value cannot be changed

        // local final variable should be used only after initialization
        // Otherwise, the compiler throws a Compile Time Error

        System.out.println(a);
        // Valid: a is initialized before use

        // System.out.println(b);
        // ❌ Compile Time Error
        // Reason:
        // b is a final local variable but it is not initialized
        // Using an uninitialized local variable is not allowed
    }
}
