public class String_Eg20 {
    public static void main(String[] args) {

        // Creating a String literal
        String s = "Hallo";

        // replace(oldChar, newChar)
        // Replaces ALL occurrences of the old character with the new character
        // It returns a NEW String (original string is not changed)
        // 'a' will be replaced with 'e'
        // Output: "Hello"
        System.out.println(s.replace('a', 'e'));

        // Creating another String literal
        String s1 = "ababab";

        // All occurrences of 'a' are replaced with 'b'
        // Output: "bbbbbb"
        System.out.println(s1.replace('a', 'b'));
    }
}
