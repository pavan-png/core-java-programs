public class StringBuffer_trimToSize_Eg40 {
    public static void main(String[] args) {

        // Creating a StringBuffer with initial capacity of 1000 characters
        StringBuffer s = new StringBuffer(1000);

        // capacity() returns the total storage capacity
        // Output: 1000
        System.out.println(s.capacity());

        // Appending a String to the StringBuffer
        s.append("Hello");

        // Printing the current content
        System.out.println(s);   // Output: Hello

        // length() returns the number of characters actually present
        // Output: 5
        System.out.println(s.length());

        // Capacity is still 1000 because capacity does not shrink automatically
        System.out.println(s.capacity());

        // trimToSize() reduces the capacity to match the current length
        // After this call:
        // capacity = length = 5
        s.trimToSize();

        // Printing the reduced capacity
        System.out.println(s.capacity());  // Output: 5
    }
}
