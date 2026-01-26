public class String_Eg120 {
    public static void main(String[] args) {

        // String literal
        // "Java" is stored in String Constant Pool (SCP)
        // s1 refers to the SCP object "Java"
        String s1 = "Java";

        // intern() checks the SCP
        // Since "Java" already exists in SCP,
        // intern() returns the SAME SCP reference
        // s2 and s1 point to the SAME object
        String s2 = s1.intern();

        // new String("Java") creates a NEW object in Heap memory
        // Content is same as SCP object, but reference is different
        String s3 = new String("Java");

        // s1 and s2 both refer to the SAME SCP object
        // Hence reference comparison returns true
        System.out.println(s1 == s2);   // true

        // s2 (SCP) and s3 (Heap) are different objects
        // Hence reference comparison returns false
        System.out.println(s2 == s3);   // false

        // s3 (Heap) and s1 (SCP) are different objects
        // Hence reference comparison returns false
        System.out.println(s3 == s1);   // false
    }
}
