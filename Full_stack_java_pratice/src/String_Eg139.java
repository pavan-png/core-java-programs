public class String_Eg139 {
    public static void main(String[] args) {

        // String literal stored in String Constant Pool (SCP)
        String string = "JAVA";

        // Creating StringBuffer object using String
        StringBuffer sbuffer = new StringBuffer(string);

        // Creating StringBuilder object using String
        StringBuilder sBuilder = new StringBuilder(string);


        // equals() in String class compares CONTENT
        // BUT it also checks whether the argument is a String object
        // sbuffer is NOT a String
        // Hence equals() returns false
        System.out.println(string.equals(sbuffer));   // false


        // sBuilder is also NOT a String
        // Even though content is same, type is different
        // Hence equals() returns false
        System.out.println(string.equals(sBuilder));  // false


        // equals() in StringBuffer is NOT overridden
        // It behaves like Object.equals()
        // Object.equals() compares REFERENCES
        // sbuffer and sBuilder refer to different objects
        // Hence reference comparison returns false
        System.out.println(sbuffer.equals(sBuilder)); // false
    }
}
