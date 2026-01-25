public class String_Eg49 {
    public static void main(String[] args) {

        // s contains ONE SPACE, not an empty string
        String s = " ";

        // trim() removes spaces ONLY from the beginning and end
        // Strings are IMMUTABLE in Java
        // So trim() creates a NEW String, but we did NOT store it
        // That new String is lost and eligible for Garbage Collection
        s.trim();

        // equals("") checks whether the content is exactly empty ("")
        // Here s is still " " (one space), so it is NOT equal to ""
        // Result: false
        System.out.print(s.equals("") + " ");

        // isEmpty() checks length == 0
        // " " has length 1, so it is NOT empty
        // Result: false
        System.out.println(s.isEmpty());

        // IMPORTANT NOTES:
        // ""  -> empty string (length = 0)
        // " " -> string with space (length = 1)
        // trim() does NOT remove spaces in the middle of a string
    }
}
