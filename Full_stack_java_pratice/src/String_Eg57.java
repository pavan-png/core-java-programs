public class String_Eg57 {
    public static void main(String[] args) {

        // String literal stored in String Constant Pool (SCP)
        // Characters are indexed starting from 0
        String str = "javacode!";

        // length() returns the TOTAL number of characters in the string
        // Here: j a v a c o d e !
        // Index:0 1 2 3 4 5 6 7 8
        // length() = 9
        //
        // charAt(8) returns the character at index 8
        // Indexing starts from 0, so index 8 is the LAST character
        System.out.println(str.length() + ":" + str.charAt(8));

        // IMPORTANT POINTS:
        // length() → count of characters (not index)
        // charAt() → works with 0-based index
        // charAt(length()) → throws StringIndexOutOfBoundsException
    }
}
