public class String_Eg73 {
    public static void main(String[] args) {

        // String literal "A" stored in String Constant Pool (SCP)
        String ta = "A";

        // concat("B") creates a NEW String "AB"
        // Result is assigned back to ta
        ta = ta.concat("B");

        // String literal "C"
        String tb = "C";

        // concat(tb) creates a NEW String "ABC"
        // Assigned back to ta
        ta = ta.concat(tb);

        // replace('C','D') creates a NEW String "ABD"
        // BUT the returned value is NOT assigned to ta
        // Since String is immutable, ta remains unchanged
        ta.replace('C', 'D');

        // concat(tb) again adds "C" to the existing ta
        // ta was still "ABC", so now it becomes "ABCC"
        ta = ta.concat(tb);

        // Prints the final value of ta
        System.out.println(ta);
    }
}
