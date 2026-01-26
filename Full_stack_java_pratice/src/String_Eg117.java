public class String_Eg117 {
    public static void main(String[] args) {

        // String literal
        // "Java" is stored in String Constant Pool (SCP)
        // str1 refers to the SCP object "Java"
        String str1 = "Java";

        // intern() checks SCP for an equal string
        // If present, it returns the reference from SCP
        // Since "Java" already exists in SCP,
        // str2 will point to the SAME object as str1
        String str2 = str1.intern();

        // new String("Java") creates a NEW object in Heap memory
        // Even though content is same, reference is different
        // str3 points to a heap object
        String str3 = new String("Java");

        // str1 and str2 refer to the SAME SCP object
        // Hence reference comparison returns true
        System.out.println(str1 == str2);   // true

        // str2 (SCP) and str3 (Heap) are different objects
        // Hence reference comparison returns false
        System.out.println(str2 == str3);   // false

        // str3 (Heap) and str1 (SCP) are different objects
        // Hence reference comparison returns false
        System.out.println(str3 == str1);   // false
    }
}
