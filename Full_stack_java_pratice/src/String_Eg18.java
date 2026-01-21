public class String_Eg18 {
    public static void main(String[] args) {

        // String literal "Hello" is created in the String Constant Pool (SCP)
        String s = "Hello";

        // s1 refers to the same object in the String Constant Pool
        String s1 = "Hello";

        // equals() method compares the CONTENT of the strings
        // It is CASE-SENSITIVE
        // "Hello" is NOT equal to "HELLO"
        // Output: false
        System.out.println(s.equals("HELLO"));

        // Both s and s1 contain the same text "Hello"
        // equals() returns true because contents are same
        // Output: true
        System.out.println(s.equals(s1));

        // equalsIgnoreCase() compares content but IGNORE case differences
        // "Hello" and "HEllO" are considered equal
        // Output: true
        System.out.println(s.equalsIgnoreCase("HEllO"));
    }
}
