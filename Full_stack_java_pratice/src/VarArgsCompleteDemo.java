public class VarArgsCompleteDemo {

    // =========================================================
    // Case 1: Valid Signatures (all are syntactically correct)
    // =========================================================

    public void validOne(int... x) { }        // valid
    public void validTwo(int...x) { }         // valid
    public void validThree(int   ...   x) { } // valid
    // Spaces do not matter
    // "..." must come after datatype


    // =========================================================
    // Case 2: Mixing Normal Argument with Var-Arg
    // =========================================================

    public void mixExample(int a, int... x) {
        System.out.println("mixExample called");
    }

    public void mixExample(String s, int... x) {
        System.out.println("mixExample with String called");
    }

    // Invalid (duplicate parameter name)
    // public void wrongMix(int x, int... x) { }
    // Reason: parameter names must be different


    // =========================================================
    // Case 3: Var-Arg Must Be Last
    // =========================================================

    public void correctOrder(int y, int... x) {
        System.out.println("Var-arg is last parameter");
    }

    // Invalid
    // public void wrongOrder(int... x, int y) { }
    // Reason: Var-arg must always be last


    // =========================================================
    // Case 4: Only One Var-Arg Allowed
    // =========================================================

    // Invalid
    // public void twoVarArgs(int... x, int... y) { }
    // Reason: Only one var-arg allowed per method


    // =========================================================
    // Case 5: Overloading with Var-Args
    // Exact match has higher priority
    // =========================================================

    public void overloadExample(int x) {
        System.out.println("Normal method");
    }

    public void overloadExample(int... x) {
        System.out.println("Var-arg method");
    }


    // =========================================================
    // Case 6: Internal Replacement
    // Internally: int... x becomes int[] x
    // =========================================================

    public void internalDemo(int... x) {
        System.out.println("Length of array: " + x.length);

        // Accessing using index (because internally it is array)
        if (x.length > 0) {
            System.out.println("First element: " + x[0]);
        }
    }

    // Internally equal to:
    // public void internalDemo(int[] x)


    // =========================================================
    // Case 7: Same Signature Problem
    // =========================================================

    // Invalid: Compile-time error
    /*

    public void signatureProblem(int... x) { }
     */
    public void signatureProblem(int[] x) { }
    // both of them are correct and valid but cannot use both at a time

    // Reason:
    // After compilation both are treated as:
    // signatureProblem(int[] x)


    // =========================================================
    // Main Method to Test Everything
    // =========================================================

    public static void main(String[] args) {

        VarArgsCompleteDemo obj = new VarArgsCompleteDemo();

        System.out.println("---- Case 2: Mixing ----");
        obj.mixExample(10, 20, 30);
        obj.mixExample("hello", 1, 2, 3);

        System.out.println("\n---- Case 3: Correct Order ----");
        obj.correctOrder(100, 1, 2, 3);

        System.out.println("\n---- Case 5: Overloading ----");
        obj.overloadExample(10);        // Normal method
        obj.overloadExample(10, 20);    // Var-arg method

        System.out.println("\n---- Case 6: Internal Replacement ----");
        obj.internalDemo(5, 10, 15);

        // Internally converted to:
        // obj.internalDemo(new int[]{5,10,15});
    }
}