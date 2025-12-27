public class Local_Variable_Eg5 {

    public static void main(String[] args) {

        int x;
        // x is a local (stack) variable
        // It is declared but NOT initialized

        // System.out.println(x);
        // ❌ Compile Time Error
        // Reason:
        // JVM does NOT provide default values for local variables
        // Java compiler enforces the "definite assignment" rule
        // Using an uninitialized local variable is not allowed
        // Error message: "variable x might not have been initialized"
    }
}
