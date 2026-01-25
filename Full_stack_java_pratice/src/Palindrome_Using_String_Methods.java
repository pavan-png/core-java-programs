public class Palindrome_Using_String_Methods {
    public static void main(String[] args) {

        // Original string
        String s1 = "pop";

        // StringBuilder is mutable and has a predefined reverse() method
        StringBuilder sb = new StringBuilder(s1);

        // reverse() reverses the characters of the StringBuilder
        String s2 = sb.reverse().toString();

        // equals() compares content (case-sensitive)
        if (s1.equals(s2)) {
            System.out.println("palindrome");
        } else {
            System.out.println("not a palindrome");
        }
    }
}
