public class Method_Overloading_Eg3 {

    // Method 1:
    // No parameters
    // Return type is void
    public void doit() {
        // some logic
    }

    /*
     * ❌ INVALID METHOD (Intentionally commented)
     *
     * public String doit() {
     *     return "hi";
     * }
     *
     * Reason:
     * This method has:
     * - Same method name
     * - Same parameter list (no parameters)
     * - Only return type is different
     *
     * Compiler DOES NOT consider return type
     * for method overloading.
     *
     * Hence, this causes a compile-time error:
     * "method doit() is already defined"
     */

    // Method 2:
    // Same method name "doit"
    // Different parameter list (int parameter)
    // This IS valid method overloading
    public double doit(int x) {
        return 0.175;
    }

    public static void main(String[] args) {
        // No method calls needed
        // This example is meant to explain compilation rules
    }
}
