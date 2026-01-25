public class StringBuffer_Set_Length_Eg39 {
    public static void main(String[] args) {

        // Creating a StringBuffer object with initial content
        StringBuffer s = new StringBuffer("Hello world how are you");

        // Printing the original content
        System.out.println(s);

        // setLength(int newLength)
        // This method changes the length of the StringBuffer
        // If newLength is LESS than the current length:
        // Characters after index (newLength - 1) are removed
        // Here, setLength(5) keeps characters from index 0 to 4
        // "Hello world how are you" → "Hello"
        s.setLength(5);

        // Printing the modified content
        System.out.println(s);
    }
}
