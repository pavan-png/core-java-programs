public class Local_Variable_Eg2 {

    public static void main(String[] args) {

        try {
            int i = Integer.parseInt("10");
            // i is a local variable declared inside the try block
            // Scope of i is ONLY within this try block
            // i is created when the try block starts executing

            System.out.println(i);
            // Valid: i is accessible inside the try block
        }
        catch (NullPointerException e) {
            e.printStackTrace();
            // e is a local variable of the catch block
            // Scope of e is ONLY within this catch block

            // ❌ i cannot be accessed here
            // Reason:
            // i is a block-level local variable declared inside try
            // Its scope ends when the try block ends
            // catch block is a separate block
        }

        // ❌ i cannot be accessed here either
        // Reason:
        // i existed only inside the try block
        // After try block execution, i is destroyed
    }
}
