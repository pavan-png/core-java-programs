public class StringBuffer_Reverse_Eg38 {
    public static void main(String[] args) {

        // Creating a StringBuffer object with initial content
        StringBuffer s = new StringBuffer("HelloWorld");

        // reverse() method reverses the characters of the StringBuffer
        // This operation modifies the SAME object
        // No new StringBuffer object is created
        s.reverse();

        // Printing the reversed content
        System.out.println(s);   // Output: dlroWolleH
    }
}
