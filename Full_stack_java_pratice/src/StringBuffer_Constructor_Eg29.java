public class StringBuffer_Constructor_Eg29 {
    public static void main(String[] args) {

        // Creating a StringBuffer with custom initial capacity = 10
        // Length is initially 0 (no characters are stored yet)
        StringBuffer s = new StringBuffer(10);

        // length() → number of characters currently present
        // Output: 0
        System.out.println(s.length());

        // capacity() → total storage capacity
        // Output: 10
        System.out.println(s.capacity());

        // Appending 5 characters ("pavan")
        // This fits within the current capacity (10)
        s.append("pavan");

        // Length becomes 5
        System.out.println(s.length());

        // Capacity remains 10 (not exceeded)
        System.out.println(s.capacity());

        // Appending 6 more characters ("kalyan")
        // Total characters now = 11 (5 + 6)
        // This exceeds the current capacity (10)
        s.append("kalyan");

        // Length becomes 11
        System.out.println(s.length());

        // Capacity increases automatically using the formula:
        // new capacity = (current capacity + 1) * 2
        // new capacity = (10 + 1) * 2 = 22
        System.out.println(s.capacity());
    }
}
