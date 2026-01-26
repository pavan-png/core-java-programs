public class String_Eg142 {
    public static void main(String[] args) {

        // String literal "null"
        // This is a NORMAL String object, NOT the null reference
        String str = "null";

        // Checking whether reference is null
        // str points to a valid String object
        // Hence this condition is false
        if (str == null)
            System.out.println("null");

        /*
        // This else block is commented because it is INVALID SYNTAX
        // After else, a CONDITION is NOT allowed
        // To check another condition, we MUST use else-if
        To check another condition → use else if
        else (str.length() == 0) {   // ❌ compile-time error

            System.out.println("zero");
        }
        */

            // This else block executes because the above if condition is false
        else {
            // str is neither null nor empty
            // It contains the text "null"
            System.out.println("some");
        }
    }
}
