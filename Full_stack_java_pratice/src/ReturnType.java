public class ReturnType {

    public int getValue() {

        int value = 0;
        // Step 1:
        // Local variable 'value' is created in stack memory
        // It is initialized with 0

        boolean setting = true;
        // Step 2:
        // Local variable 'setting' is created and initialized

        String title = "Hello";
        // Step 3:
        // Reference variable 'title' is created
        // It points to String object "Hello" in String Constant Pool

        /*
        if (value || (setting && title == "Hello")) {
            return 1;
        }
        */

        // ❌ INTERNAL COMPILER CHECK (if uncommented):
        // 1. Compiler sees logical OR operator (||)
        // 2. Both operands of || MUST be boolean
        // 3. 'value' is int, NOT boolean
        // 4. Java does NOT allow int-to-boolean conversion
        // → Compile Time Error occurs before execution starts

        if (value == 1 & title.equals("Hello")) {
            // Step 4:
            // Compiler checks the condition:
            // value == 1 → boolean result (false)
            // title.equals("Hello") → boolean result (true)

            // Step 5:
            // '&' is a NON-short-circuit operator
            // So BOTH expressions are evaluated, even if first is false

            return 2;
            // Step 6 (if condition is true):
            // Method execution STOPS immediately
            // Value 2 is returned to the caller
            // Stack frame of getValue() is destroyed
        }

        // Step 7:
        // If the if-condition is false (which it is here),
        // control reaches this line

        return value;
        // Step 8:
        // 'value' (0) is returned to the caller
        // Stack frame of getValue() is removed
        // Local variables are destroyed
    }

    public static void main(String[] args) {

        ReturnType obj = new ReturnType();
        // Step 9:
        // Object of ReturnType is created in heap
        // Reference 'obj' is stored in stack

        System.out.println(obj.getValue());
        // Step 10:
        // getValue() is called
        // Returned value (0) is printed
    }
}
