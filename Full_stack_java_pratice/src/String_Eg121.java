public class String_Eg121 {
    public static void main(String[] args) {

        // String literal
        // "Java" is stored in String Constant Pool (SCP)
        // str1 refers to the SCP object
        String str1 = "Java";

        // intern() checks SCP
        // Since "Java" already exists in SCP,
        // it returns the SAME SCP reference
        // str2 and str1 point to the SAME object
        String str2 = str1.intern();

        // == compares REFERENCES (memory location)
        // Both references point to the SAME SCP object
        // Hence it returns true
        System.out.println(str1 == str2);   // true

        // equals() compares CONTENT of the string
        // Content of str1 and str2 is "Java"
        // Hence it also returns true
        System.out.println(str1.equals(str2));  // true
    }
}
