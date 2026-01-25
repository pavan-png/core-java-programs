public class String_Eg54 {
    public static void main(String[] args) {

        // String literal → stored in String Constant Pool (SCP)
        String s1 = "Java";

        // new String() → creates a new String object in Heap memory
        // Content is "java" (lowercase)
        String s2 = new String("java");

        // s3 is assigned the reference of s2
        // No new object is created
        // s3 and s2 now point to the SAME heap object
        String s3 = s2;

        // equalsIgnoreCase() compares CONTENT only
        // It ignores case differences (Java == java)
        // It does NOT compare memory references
        if (s3.equalsIgnoreCase(s2)) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }

        // IMPORTANT POINTS:
        // 1. equalsIgnoreCase() → content comparison (case-insensitive)
        // 2. s2 and s3 point to same object, but that is NOT the reason it returns true
        // 3. Even if they pointed to different objects, equalsIgnoreCase() would still return true
    }
}
