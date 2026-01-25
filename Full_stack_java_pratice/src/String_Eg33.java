public class String_Eg33 {
    public static void main(String[] args) {

        // Creating a StringBuffer object
        StringBuffer s = new StringBuffer("Hello");

        // Creating a String literal
        String s1 = "Hello";

        // s.toString() converts StringBuffer to String
        // s1.toString() returns the same String object (String overrides toString())
        // equals() of String compares CONTENT, not reference
        // Both contents are "Hello", so this condition is TRUE
        if (s.toString().equals(s1.toString()))
            System.out.println("Match = -1");

            // This condition is NOT checked because first if is already true
            // s.equals(s1):
            // StringBuffer does NOT override equals()
            // So Object class equals() is used
            // Object.equals() compares REFERENCES, not content
            // s (StringBuffer object) and s1 (String object) are different objects
            // Hence this comparison is FALSE
        else if (s.equals(s1))
            System.out.println("Match = -2");

            // This block will not execute because first condition is true
        else
            System.out.println("no match");
    }
}
