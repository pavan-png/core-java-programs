public class String_Eg96 {
    public static void main(String[] args) {

        // "java" literal is created once in the String Constant Pool (SCP)
        String s = "java";

        // s1 points to the SAME SCP object "java"
        String s1 = "java";

        // StringBuilder object is created in Heap memory
        // It copies the characters 'j','a','v','a' into its internal array
        StringBuilder s2 = new StringBuilder("java");

        // String.equals() compares CONTENT, not reference
        // s and s1 both contain "java"
        System.out.println(s.equals(s1));  // true

        /*
         * s.equals(s2)
         * ----------------
         * String.equals(Object obj) checks:
         * 1) obj must be of type String
         * 2) then compares character-by-character content
         *
         * Since s2 is StringBuilder (NOT String),
         * equals() immediately returns false
         */

        /*
         * s2.equals(s)
         * ----------------
         * StringBuilder does NOT override equals()
         * It uses Object.equals()
         * Object.equals() compares references (memory address)
         *
         * s2 and s are different objects → false
         */
        System.out.println(s.equals(s2) + " :  " + s2.equals(s));
    }
}
