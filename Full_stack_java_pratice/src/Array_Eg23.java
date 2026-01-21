public class Array_Eg23 {

    // ✔ VALID:
    // static final array is DECLARED and INITIALIZED here
    //
    // IMPORTANT:
    // There is NO rule that a static final array MUST be initialized
    // at the declaration itself.
    //
    // Rule is:
    // A static final variable MUST be initialized exactly ONCE
    // either at declaration OR inside a static block.
    //
    // 'final' means:
    // - the reference 'a' cannot be changed
    // - but the contents of the array CAN be changed
    static final int[] a = {100, 200};

    // ✔ VALID:
    // static final array is only DECLARED here
    // initialization is done later in a static block
    static final int[] b;

    static {
        // This is a valid place to initialize static final variables
        b = new int[2];
        b[0] = 100;
        b[1] = 200;
    }

    // ❌ INVALID (INTENTIONALLY COMMENTED):
    // When using array initializer {} we must NOT specify the size
    //
    // Reason:
    // Java already knows the size from the number of values
    //
    // static final int[] c = new int[2]{100,200};  ❌ compile-time error

    /*
    ❌ INVALID (INTENTIONALLY COMMENTED):

    static final int[] d;

    static void init() {
        // This is NOT allowed because:
        //
        // static final variables must be initialized
        // during CLASS LOADING time
        //
        // Methods execute at RUNTIME, not at class loading
        // Therefore initialization inside a method is illegal

        d = new int[3];
        d[0] = 100;
        d[1] = 200;
    }
    */

    /*
    ⭐ CORRECT RULE (FINAL VERSION):

    If a variable is declared as static final:

    ✔ It does NOT have to be initialized at declaration
    ✔ It MUST be initialized exactly once
    ✔ Valid initialization places:
        1) At declaration
        2) Inside a static block

    ❌ Invalid places:
        - Inside methods
        - Inside constructors
        - Inside instance blocks
    */

    public static void main(String[] args) {
        // No runtime logic
        // This class exists to demonstrate initialization rules
    }
}
