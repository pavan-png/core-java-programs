public class String_Eg103 {
    public static void main(String[] args) {

        /*
         * "JavaWorld" is a String literal.
         * It is created and stored in the String Constant Pool (SCP).
         */
        String javaworld = "JavaWorld";

        /*
         * "Java" and "World" are also String literals.
         * Both are stored in the SCP.
         */
        String java = "Java";
        String world = "World";

        /*
         * java += world;
         *
         * This is equivalent to:
         * java = java + world;
         *
         * Since 'java' is NOT final, this concatenation
         * happens at RUNTIME.
         *
         * JVM internally creates a new String object
         * (using StringBuilder) in HEAP memory.
         */
        java += world;

        /*
         * == compares object references.
         *
         * javaworld → points to SCP object "JavaWorld"
         * java      → points to a NEW heap object "JavaWorld"
         *
         * Different memory locations → false
         */
        System.out.println(java == javaworld); // false
    }
}
