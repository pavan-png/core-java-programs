public class String_Eg19 {
    public static void main(String[] args) {

        // Creating a String literal
        String s = "powerstarpavankalyan";

        // substring(beginIndex)
        // Returns a new String starting from index 9 till the end of the string
        // Index starts from 0
        // Characters from index 9 → end are returned
        System.out.println(s.substring(9));

        // substring(beginIndex, endIndex)
        // Returns a new String starting from index 9
        // and ending at index (endIndex - 1)
        // endIndex is NOT included
        System.out.println(s.substring(9, 14));
    }
}
