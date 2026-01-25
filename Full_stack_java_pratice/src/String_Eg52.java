public class String_Eg52 {
    public static void main(String[] args) {

        // String literal -> stored in String Constant Pool (SCP)
        String s1 = "Java";

        // new String() -> creates a NEW object in Heap memory
        String s2 = new String("java");

        // Now s1 reference is changed to point to s2 object
        // "Java" literal is no longer referenced by s1
        s1 = s2;

        // == compares REFERENCES (memory addresses), NOT content
        // s1 and s2 now point to SAME object in heap
        if (s1 == s2) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }

        // Prints the content of s1
        System.out.println(s1);

        // String literal -> goes to String Constant Pool
        String s3 = "java";

        // s1 points to heap object ("java")
        // s3 points to SCP object ("java")
        // Different memory locations
        System.out.println(s1 == s3);
    }
}
