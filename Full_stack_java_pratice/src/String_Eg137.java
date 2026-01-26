public class String_Eg137 {
    public static void main(String[] args) {

        // String value
        // Index positions:
        // 0:s 1:a 2:c 3:h 4:i 5:n 6:space
        // 7:r 8:a 9:m 10:e 11:s 12:h 13:space
        // 14:t 15:e 16:n 17:d 18:u 19:l 20:k 21:a 22:r
        String s1 = "sachin ramesh tendulkar";

        // indexOf('a')
        // Finds FIRST occurrence of character 'a'
        // 'a' appears first at index 1
        int firstAIndex = s1.indexOf('a');   // 1

        // indexOf("dulkar")
        // Searches for the exact substring "dulkar"
        // Substring starts at character 'd'
        // 'd' is at index 17
        int dulkarIndex = s1.indexOf("dulkar"); // 17

        // Both index values are added
        // 1 + 17 = 18
        System.out.println(firstAIndex + dulkarIndex); // prints 18
    }
}
