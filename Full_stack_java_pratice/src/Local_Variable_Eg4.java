public class Local_Variable_Eg4{

    public static void main(String[] args) {

        int x;
        // x is a local variable
        // It is declared but NOT initialized

        if (args.length > 0) {
            // This condition depends on runtime input (command-line arguments)
            // The compiler cannot guarantee that this condition will be true

            x = 10;
            // x is initialized ONLY if the condition is true
        }

       // System.out.println(x);
        // ❌ Compile Time Error
        // Reason:
        // Java follows the "definite assignment" rule
        // The compiler must be 100% sure that x is initialized before use
        // Since args.length may be 0, x may remain uninitialized
        // Therefore, the compiler reports:
        // "variable x might not have been initialized"
    }
}
