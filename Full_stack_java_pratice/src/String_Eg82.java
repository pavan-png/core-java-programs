public class String_Eg82 {
    public static void main(String[] args) {

        // Step 1: "1".concat("2")
        // concat() joins two strings
        // Result: "12"

        // Step 2: repeat(5)
        // Repeats the string "12" five times
        // Result: "1212121212"

        // Step 3: charAt(7)
        // Returns the character at index 7
        // Indexing starts from 0
        // 0 1 2 3 4 5 6 7 8 9
        // 1 2 1 2 1 2 1 2 1 2
        // Character at index 7 is '2'

        System.out.println("1".concat("2").repeat(5).charAt(7));
        // Output: 2
    }
}
