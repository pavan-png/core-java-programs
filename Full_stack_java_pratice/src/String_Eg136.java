public class String_Eg136 {
    public static void main(String[] args) {

        // Expression:
        // 1 + null + "null"

        // Evaluation happens from LEFT to RIGHT

        // Step 1: 1 + null
        // 1 is a primitive int
        // null has no type and cannot be used in arithmetic addition
        // Since the first operand is NOT a String,
        // Java tries numeric addition

        // int + null → INVALID
        // This causes a COMPILE-TIME ERROR

        // Hence the below line is commented
        // String s1 = 1 + null + "null";  // ❌ Compile-time error


        // IMPORTANT NOTE:
        // If a String comes FIRST, concatenation is allowed
        // Example:
        // "null" + null + 1  → valid
    }
}
