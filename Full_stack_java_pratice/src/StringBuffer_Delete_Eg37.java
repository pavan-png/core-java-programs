public class StringBuffer_Delete_Eg37 {
    public static void main(String[] args) {

        // Creating a StringBuffer object with initial content
        StringBuffer s = new StringBuffer("Hello pavan wo1rld");

        // delete(int begin, int end)
        // Deletes characters starting from index 5 up to index 11 (end - 1)
        // Index positions:
        // "Hello pavan wo1rld"
        //  0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16
        // Characters deleted: " pavan "
        s.delete(5, 12);

        // Printing the result after delete(begin, end)
        System.out.println(s);   // Output: Hellowo1rld

        // deleteCharAt(int index)
        // Deletes the character at index 7
        // Index 7 corresponds to character '1'
        s.deleteCharAt(7);

        // Printing the result after deleteCharAt()
        System.out.println(s);   // Output: Helloworld
    }
}
