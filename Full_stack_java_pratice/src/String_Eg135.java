public class String_Eg135 {
    public static void main(String[] args) {

        // First operand is a String literal "null"
        // When the first operand of + is a String,
        // Java treats the + operator as STRING CONCATENATION

        // "null" + null
        // null is converted to the String "null"
        // Result → "nullnull"

        // "nullnull" + 1
        // 1 is converted to String "1"
        // Final result → "nullnull1"
        String s1 = "null" + null + 1;

        // Prints the concatenated String
        System.out.println(s1);   // prints "nullnull1"
    }
}
