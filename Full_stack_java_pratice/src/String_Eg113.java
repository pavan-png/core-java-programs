public class String_Eg113 {
    public static void main(String[] args) {

        // String contains ONE space character
        // Space is a valid character, not an empty string
        String str = " ";

        // isBlank() checks whether the string contains
        // only white-space characters (space, tab, newline, etc.)
        // Since the string has only a space, it returns true
        System.out.println(str.isBlank());   // true

        // isEmpty() checks whether the string length is 0
        // Here length is 1 because it contains a space
        // So it is NOT empty
        System.out.println(str.isEmpty());   // false
    }
}
