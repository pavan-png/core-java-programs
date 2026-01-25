public class StringBuffer_Constructor_Eg28 {
    public static void main(String[] args) {

        // Creating an empty StringBuffer object
        // Default initial capacity = 16 characters
        StringBuffer s = new StringBuffer();

        // length() returns the number of characters currently stored
        // Initially, no characters are added, so length is 0
        System.out.println("default length is " + s.length());

        // Appending 20 characters to StringBuffer
        // This exceeds the default capacity of 16
        s.append("abcdefghijklmnopqrst");

        // After appending, length becomes 20
        System.out.println("increased length of StringBuffer " + s.length());

        // capacity() returns the total storage capacity
        // Since 20 > 16, capacity is increased automatically
        System.out.println(s.capacity());  // 34

        // Appending one more character
        // Current capacity (34) is sufficient, so capacity remains same
        s.append('q');

        // Length becomes 21
        System.out.println(s.length());

        // Capacity remains 34 because it is not exceeded
        System.out.println(s.capacity());

        /*
         Capacity growth rule:
         - Initial capacity = 16
         - When capacity is exceeded:
           new capacity = (current capacity + 1) * 2

         In this example:
         - Initial capacity = 16
         - After adding 20 characters:
           new capacity = (16 + 1) * 2 = 34

         If length exceeds 34:
         - New capacity = (34 + 1) * 2 = 70

         Important:
         - No new StringBuffer object is created
         - Only the internal character array size increases
         */
    }
}
