public class String_Eg32 {
    public static void main(String[] args) {

        // Creating a StringBuffer object with initial content "Helloworld"
        StringBuffer s = new StringBuffer("Helloworld");

        // setCharAt(int index, char ch) changes the character at the given index
        // Indexing starts from 0
        // "Helloworld"
        //  0 1 2 3 4 5 6 7 8 9
        // Character at index 5 is 'w'
        // It is replaced with 'W'
        // This method is available only in mutable classes
        // such as StringBuffer and StringBuilder (NOT in String)
        s.setCharAt(5, 'W');

        // setCharAt() returns void (no value)
        // So it should NOT be used inside System.out.println()
        // We print the object after modification
        System.out.println(s);   // Output: HelloWorld
    }
}
