public class Method_Chaining_Eg42 {
    public static void main(String[] args) {

        // Creating a String object
        String name = "pavan";

        // Step-by-step method calls (NO chaining)
        // toUpperCase() returns a new String "PAVAN"
        String data = name.toUpperCase();

        // length() returns the number of characters
        int count = data.length();

        // Printing the length
        System.out.println(count);   // Output: 5

        // -------------------------------
        // Method chaining with String
        // -------------------------------
        // toUpperCase() returns a String
        // length() is called on that returned String
        System.out.println(name.toUpperCase().length()); // Output: 5

        // --------------------------------
        // Method chaining with StringBuffer
        // --------------------------------

        // Creating a StringBuffer object
        StringBuffer s = new StringBuffer("pavan");

        /*
         Method chaining explanation:
         - Each method modifies the SAME StringBuffer object
         - Each method returns the same object reference
         - So the next method is called on the same object
        */

        s.append("kalyan")          // "pavankalyan"
                .insert(5, '1')            // "pavan1kalyan"
                .reverse()                 // "naylak1navap"
                .append("Hello")           // "naylak1navapHello"
                .insert(s.length(), "Hello") // inserts "Hello" at the end
                .reverse()                 // reverses the whole content
                .delete(0, 4);              // deletes characters from index 0 to 3

        // Printing the final result
        System.out.println(s);
    }
}
