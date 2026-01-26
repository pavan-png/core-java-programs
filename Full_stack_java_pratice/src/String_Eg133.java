public class String_Eg133 {
    public static void main(String[] args) {

        // String value
        // Total number of characters is calculated by length()
        String s = "Hey pavan how is the day";

        // length() returns the TOTAL number of characters in the string
        // For this string, suppose length() = N
        //
        // Valid index range for charAt() is:
        // 0 to (length - 1)
        //
        // Here charAt(s.length()) tries to access index N
        // But last valid index is (N - 1)
        // Hence this causes StringIndexOutOfBoundsException
        System.out.println(s.charAt(s.length()));  // ❌ Exception
    }
}
