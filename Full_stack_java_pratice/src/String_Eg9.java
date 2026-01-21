public class String_Eg9 {
    public static void main(String[] args) {

        // Creates a NEW String object in HEAP
        // "you cannot change me" literal is stored in String Constant Pool (SCP)
        String s1 = new String("you cannot change me");

        // Creates another NEW String object in HEAP
        // Even though content is same, this is a DIFFERENT object
        String s2 = new String("you cannot change me");

        // == compares references (heap vs heap, different objects)
        // Result: false
        System.out.println(s1 == s2);

        // String literal is reused from SCP
        // s3 points directly to SCP object
        String s3 = "you cannot change me";

        // s1 (heap) vs s3 (SCP)
        // Different memory locations → false
        System.out.println(s1 == s3);

        // Same literal reused from SCP
        // s3 and s4 point to SAME SCP object
        String s4 = "you cannot change me";

        // == compares reference → true
        System.out.println(s3 == s4);

        // Compile-time constant concatenation
        // Compiler joins literals and creates ONE SCP entry
        String s5 = "you cannot" + " change me";

        // s5 refers to same SCP object as s3
        // Result: true
        System.out.println(s3 == s5);

        // s6 is a normal (non-final) variable
        // Stored in SCP
        String s6 = "you cannot";

        // Runtime concatenation (uses StringBuilder internally)
        // New String object is created in HEAP
        String s7 = s6 + " change me";

        // s3 (SCP) vs s7 (HEAP)
        // Result: false
        System.out.println(s3 == s7);

        // final variable → value known at compile time
        final String s8 = "you cannot";

        // Compile-time concatenation because s8 is final
        // Resulting string is placed in SCP
        String s9 = s8 + " change me";

        // s3 and s9 both point to SAME SCP object
        // Result: true
        System.out.println(s3 == s9);

        // Both s6 and s8 refer to same SCP literal
        // Result: true
        System.out.println(s6 == s8);
    }
}
