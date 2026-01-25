public class String_Eg58 {
    public static void main(String[] args) {

        // String literals are stored in String Constant Pool (SCP)
        // s1 contains uppercase 'H'
        String s1 = "Hello";

        // s2 contains lowercase 'h'
        String s2 = "hello";

        // equals() compares the CONTENT of strings
        // It is CASE-SENSITIVE
        // Since "Hello" and "hello" are not exactly the same,
        // equals() returns false
        System.out.println(s1.equals(s2));

        // IMPORTANT POINTS:
        // 1. equals() → content comparison
        // 2. Case-sensitive comparison
        // 3. Use equalsIgnoreCase() to ignore case differences
    }
}
