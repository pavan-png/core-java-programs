public class String_Eg90 {
    public static void main(String[] args) {

        // Creates a new String object with value "JAVA"
        // This object is created in Heap memory
        String s1 = new String("JAVA");

        // Creates another new String object with the same value "JAVA"
        // This is a different object in Heap memory
        String s2 = new String("JAVA");

        // == compares memory references (addresses), not content
        // s1 and s2 point to two different Heap objects
        System.out.println(s1 == s2); // false

        // equals() compares the content (value) of the strings
        // Both s1 and s2 contain "JAVA"
        System.out.println(s1.equals(s2)); // true

        // intern() returns the reference of the String from String Constant Pool (SCP)
        // s2.intern() points to the SCP object "JAVA"
        // s1 points to a Heap object, so references are different
        System.out.println(s1 == s2.intern()); // false

        // s1.intern() returns SCP "JAVA"
        // s2.intern() also returns the same SCP "JAVA"
        // Both references point to the same object
        System.out.println(s1.intern() == s2.intern()); // true

        // s1.intern() points to SCP "JAVA"
        // s2 points to a Heap object
        // References are different
        System.out.println(s1.intern() == s2); // false
    }
}
