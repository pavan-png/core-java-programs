public class Strings_Eg6 {
    public static void main(String[] args) {

        // Creates a NEW String object in HEAP
        // "Hello" literal is stored in String Constant Pool (SCP)
        String s1 = new String("Hello");

        // Creates another NEW String object in HEAP
        // Even though content is same, this is a DIFFERENT object
        String s2 = new String("Hello");

        // == compares reference (memory address)
        // s1 and s2 point to different heap objects
        // So result is false
        System.out.println(s1 == s2);

        // String literal "Hello" is already present in SCP
        // s3 points to the SAME SCP object
        String s3 = "Hello";

        // No new object is created
        // s4 also points to the SAME SCP object
        String s4 = "Hello";

        // == compares reference
        // s3 and s4 point to SAME SCP object
        // So result is true
        System.out.println(s3 == s4);
    }
}
