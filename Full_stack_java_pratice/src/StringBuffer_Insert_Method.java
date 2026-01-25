public class StringBuffer_Insert_Method {
    public static void main(String[] args) {

        // Creating a StringBuffer object with initial content
        StringBuffer s = new StringBuffer("Helloworld");

        // insert(int index, String str)
        // Inserts the given String starting at index 5
        // Indexing starts from 0
        // "Helloworld"
        //  0 1 2 3 4 5 6 7 8 9
        // After insertion, existing characters are shifted to the right
        s.insert(5, " pavan, ");

        // Prints the updated content
        System.out.println(s);   // Hello pavan, world

        // insert(int index, int i)
        // The int value 1 is automatically converted to String "1"
        // It is inserted at index 5
        s.insert(5, 1);

        // Prints the updated content
        System.out.println(s);

        // length() returns the number of characters currently present
        // Return type of length() is int, so it can be used as index
        // Inserting at s.length() means appending at the end
        s.insert(s.length(), " add me");

        // Prints the final content
        System.out.println(s);
    }
}
