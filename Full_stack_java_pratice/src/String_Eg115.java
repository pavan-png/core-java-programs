public class String_Eg115 {
    public static void main(String[] args) {

        // String is immutable
        // s refers to a String object with value "1"
        String s = "1";

        // concat("2") creates a NEW String object → "12"
        // concat("3") is called on the result of previous concat
        // Another NEW String object is created → "123"
        // Method chaining works because concat() returns a String
        // Original String object "1" remains unchanged
        System.out.println(s.concat("2").concat("3"));  // prints 123
    }
}
