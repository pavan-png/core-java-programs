public class String_Eg128 {

    // Static String variable
    // Default value for any reference variable is null
    static String s;

    // Explicitly assigned null
    static String s1 = null;

    public static void main(String[] args) {

        // s1 is null
        // No String object is created in memory
        // Calling isBlank() on a null reference
        // JVM tries to access a method on null
        // This results in NullPointerException
        // System.out.println(s1.isBlank());  // ❌ NPE


        // s is also null by default
        // Again, no object is created
        // Calling isBlank() on null reference
        // This also results in NullPointerException
        // System.out.println(s.isBlank());   // ❌ NPE


        // IMPORTANT NOTE:
        // isBlank() is a method of String class
        // It can be called ONLY when a String object exists
        // null means reference exists but object does NOT exist
    }
}
