public class String_Eg119 {
    public static void main(String[] args) {

        // String literal
        // "Javatpoint" is stored in String Constant Pool (SCP)
        // s1 refers to the SCP object
        String s1 = "Javatpoint";

        // intern() checks SCP and returns SCP reference
        // Since "Javatpoint" already exists in SCP,
        // s2 points to the SAME SCP object as s1
        String s2 = s1.intern();

        // new String("Javatpoint") creates a NEW object in Heap memory
        // Content is same but reference is different
        String s3 = new String("Javatpoint");

        // intern() is called on heap object s3
        // It returns the SCP reference of "Javatpoint"
        // s4 points to the SAME SCP object as s1 and s2
        String s4 = s3.intern();

        // s1 and s2 both refer to the SAME SCP object
        System.out.println(s1 == s2);   // true

        // s1 (SCP) and s3 (Heap) are different objects
        System.out.println(s1 == s3);   // false

        // s1 and s4 both refer to the SAME SCP object
        System.out.println(s1 == s4);   // true

        // s2 (SCP) and s3 (Heap) are different objects
        System.out.println(s2 == s3);   // false

        // s2 and s4 both refer to the SAME SCP object
        System.out.println(s2 == s4);   // true

        // s3 (Heap) and s4 (SCP) are different objects
        System.out.println(s3 == s4);   // false
    }
}
