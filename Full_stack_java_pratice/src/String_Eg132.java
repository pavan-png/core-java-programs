public class String_Eg132 {
    public static void main(String[] args) {

        // Original String
        // Index positions:
        // 0:H 1:e 2:l 3:l 4:o 5:space 6:p 7:a 8:v 9:a
        // 10:n 11:space 12:h 13:o 14:w 15:space
        // 16:a 17:r 18:e 19:space 20:y 21:o 22:u
        String s = "Hello pavan how are you";

        // indexOf('n', 5)
        // Search for character 'n'
        // Searching STARTS from index 5 (inclusive)
        // Character 'n' is found at index 10
        // Hence indexOf() returns 10
        System.out.println(s.indexOf('n', 5));  // 10
    }
}
