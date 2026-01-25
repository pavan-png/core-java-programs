public class String_Eg31 {
    public static void main(String[] args) {

        // Creating a StringBuffer object with initial content "Hello"
        StringBuffer s = new StringBuffer("Hello");

        // charAt(int index) returns the character at the given index
        // Indexing starts from 0
        // "Hello"
        //  0 1 2 3 4
        // So index 3 corresponds to 'l'
        System.out.println(s.charAt(3));   // Output: l

        // charAt(-1) is invalid because negative index is not allowed
        // Even though StringBuffer is mutable, index rules are same as String
        // Valid index range: 0 to length - 1
        // This causes StringIndexOutOfBoundsException at runtime
        System.out.println(s.charAt(-1));

        /*
         Important points:
         - StringBuffer internally uses a character sequence
         - Indexing rules are exactly the same as String
         - Negative index or index >= length is not allowed
         - Exception thrown: StringIndexOutOfBoundsException
         */
    }
}
