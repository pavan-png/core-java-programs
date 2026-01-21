public class String_Eg16 {
    public static void main(String[] args) {

        // Creating a String object with value "Hello"
        String s = new String("Hello");

        // length() is a method of the String class
        // It returns the number of characters present in the string
        // "Hello" contains 5 characters, so output will be 5
        System.out.println(s.length());

        // In arrays, 'length' is a variable (property), not a method
        // Example: int[] arr = {1, 2, 3}; arr.length → 3

        // In String class, length() is a method, not a variable
        // Example: s.length() → returns string length
    }
}
