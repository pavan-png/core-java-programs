public class String_Eg50 {
    public static void main(String[] args) {

        // String contains a space BETWEEN two words
        // There are NO spaces at the beginning or end
        String s = "SACHIN TENDULKAR";

        // length() returns the total number of characters
        // Space between words is also counted as ONE character
        System.out.println(s.length());

        // trim() removes spaces ONLY from the start and end
        // Since there are no leading or trailing spaces here,
        // trim() will NOT change the string
        // So length remains the same
        int a = s.trim().length();

        // Prints the length after trim()
        System.out.println(a);

        // IMPORTANT POINTS:
        // 1. trim() does NOT remove spaces in between words
        // 2. trim() works only on starting and ending spaces
        // 3. String is immutable, so trim() returns a new String
    }
}
