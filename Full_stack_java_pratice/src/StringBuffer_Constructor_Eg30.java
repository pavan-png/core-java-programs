public class StringBuffer_Constructor_Eg30 {
    public static void main(String[] args) {

        // Creating a StringBuffer using String constructor
        // Initial content = "Hi" (2 characters)
        // Initial capacity = length of string + 16
        // Capacity = 2 + 16 = 18
        StringBuffer s = new StringBuffer("Hi");

        // length() returns number of characters present
        // Output: 2
        System.out.println(s.length());

        // capacity() returns total storage capacity
        // Output: 18
        System.out.println(s.capacity());

        // Appending 17 more characters
        // Total characters = 2 + 17 = 19
        // This exceeds current capacity (18)
        s.append("abcdefghijklmnopq");

        // length becomes 19
        System.out.println(s.length());

        // Capacity increases using the formula:
        // new capacity = (current capacity + 1) * 2
        // new capacity = (18 + 1) * 2 = 38
        System.out.println(s.capacity());
    }
}
