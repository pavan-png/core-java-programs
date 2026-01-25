public class String_Eg64 {
    public static void main(String[] args) {

        // String literal → stored in String Constant Pool (SCP)
        String s1 = "hello";

        // This is COMPILE-TIME concatenation
        // "hello" + "" is evaluated by the compiler itself
        // Result becomes "hello"
        // So s2 also points to the SAME SCP object as s1
        String s2 = "hello" + "";

        // String literal stored in SCP
        String s3 = "hello pavan";

        // Both parts are string literals
        // Compiler joins them at COMPILE TIME
        // "hello" + " pavan" → "hello pavan"
        // So s4 also points to the SAME SCP object as s3
        String s4 = "hello" + " pavan";

        // == compares REFERENCES
        System.out.println(s1 == s2); // true
        System.out.println(s3 == s4); // true
    }
}
