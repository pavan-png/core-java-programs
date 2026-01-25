public class Copy_Of_String_Eg43 {
    public static void main(String[] args) {

        // Original String literal
        String s = "Hello  pavan";

        // Empty String to store the copied characters
        String s2 = "";

        // Loop through each character of the original String
        for (int i = 0; i < s.length(); i++) {

            // charAt(i) returns the character at index i
            // s2 = s2 + character creates a NEW String object each time
            // because String is immutable
            s2 = s2 + s.charAt(i);
        }

        // Printing the original String
        System.out.println("Original String : " + s);

        // Printing the copied String
        System.out.println("Copy of String : " + s2);
    }
}
