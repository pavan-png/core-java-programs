public class String_Eg86 {
    public static void main(String[] args) {

        // "string" is a String literal
        // It is stored in the String Constant Pool (SCP)

        // toUpperCase() converts the string to uppercase
        // It creates a NEW String object with value "STRING"
        // This new object is created in Heap memory (not in SCP)

        // "STRING" is a String literal
        // It already exists in the String Constant Pool (SCP)

        // == operator compares memory references, not string content
        // Heap object ("STRING" from toUpperCase) and SCP object ("STRING")
        // point to different memory locations

        if ("string".toUpperCase() == "STRING") {
            // This block will NOT execute
            // because the references are different
            System.out.println(true);
        }
        else {
            // This block executes
            System.out.println(false);
        }
    }
}
