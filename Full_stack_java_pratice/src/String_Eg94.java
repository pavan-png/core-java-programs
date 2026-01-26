public class String_Eg94 {
    public static void main(String[] args) {

        // Creates a StringBuilder object with content "java"
        // This object is created in Heap memory
        StringBuilder sb = new StringBuilder("java");

        // Converts StringBuilder content into a new String object
        // toString() creates a NEW String in Heap memory
        String s = sb.toString();

        // "java" is a String literal
        // It is stored in the String Constant Pool (SCP)
        String s1 = "java";

        // == operator compares memory references, not content
        // s  -> Heap String object ("java")
        // s1 -> SCP String literal ("java")
        // Both point to different memory locations
        System.out.println(s == s1); // false
    }
}
