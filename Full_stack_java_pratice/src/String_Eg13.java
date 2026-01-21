public class String_Eg13 {
    public static void main(String[] args) {

        // Creating a byte array
        // Each number represents an ASCII value
        // 65 -> 'A', 66 -> 'B', 67 -> 'C', 68 -> 'D'
        byte[] b = {65, 66, 67, 68};

        // getClass().getName() prints the runtime type of the array
        // [B  -> byte array
        System.out.println("type of b is " + b.getClass().getName());

        // Creating a String from byte array
        // String(byte[]) constructor converts each byte
        // to its corresponding character using default charset
        // A NEW String object is created in HEAP
        // Content becomes "ABCD"
        String s1 = new String(b);

        // Prints the String content
        System.out.println(s1);

        // Prints the runtime class name of s1
        // Output: java.lang.String
        System.out.println("type of s1 is " + s1.getClass().getName());

        // intern() checks the String Constant Pool (SCP)
        // If "ABCD" exists, it returns the SCP reference
        // Otherwise, it adds "ABCD" to SCP
        String s2 = s1.intern();

        // String literal "ABCD" is stored in SCP
        String s3 = "ABCD";

        // == compares references (memory addresses)
        // s2 and s3 both refer to the SAME SCP object "ABCD"
        // So the result is true
        System.out.println(s2 == s3);
    }
}
