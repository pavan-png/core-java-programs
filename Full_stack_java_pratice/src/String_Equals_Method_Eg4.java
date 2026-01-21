public class String_Equals_Method_Eg4 {
    public static void main(String[] args) {

        // space is also compared in strings

        System.out.println("---------------------------with new keyword-----------------------------------");

        // A new String object is created in HEAP
        // "Hello" literal is created (or reused) from String Constant Pool (SCP)
        // s1 refers to heap object
        String s1 = new String("Hello");

        // Another NEW String object is created in HEAP
        // Even though content is same, this is a DIFFERENT object
        String s2 = new String("Hello");

        // == compares reference (memory address), not content
        // s1 and s2 point to different heap objects
        System.out.println("without equals method : " + (s1 == s2));

        // equals() compares CONTENT of the String
        // Both contain "Hello", so result is true
        System.out.println("with equals method  : " + s1.equals(s2));

        System.out.println();

        System.out.println("------------------------without new keyword-------------------------------------");
        System.out.println();

        // When no new keyword is used, string literals are stored in SCP
        // Only ONE "pavan" object is created in SCP
        String s3 = "pavan";

        // s4 refers to the SAME object in SCP
        String s4 = "pavan";

        // == compares references
        // Both s3 and s4 point to SAME SCP object
        System.out.println("without equals method : " + (s3 == s4));

        // equals() compares content
        // Content is same, so true
        System.out.println("with equals method  : " + s3.equals(s4));

        System.out.println();

        System.out.println("------------------------1st one with new keyword , 2nd one without new keyword----------------");
        System.out.println();

        // Creates a NEW String object in HEAP
        // "everyone" literal exists in SCP
        String s5 = new String("everyone");

        // s6 refers directly to SCP object
        String s6 = "everyone";

        // == compares references
        // s5 (heap) and s6 (SCP) are DIFFERENT locations
        System.out.println("without equals method : " + (s5 == s6));

        // equals() compares content
        // Both contain same characters, so true
        System.out.println("with equals method  : " + s5.equals(s6));
    }
}
