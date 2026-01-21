public class String_Builder_Equals_Method_Eg5 {
    public static void main(String[] args) {

        // Creates a new StringBuilder object in HEAP
        // "Hello" is a String literal stored in String Constant Pool (SCP)
        StringBuilder s1 = new StringBuilder("Hello");

        // Creates another NEW StringBuilder object in HEAP
        // Even though the content is same, this is a DIFFERENT object
        StringBuilder s2 = new StringBuilder("Hello");

        // == compares reference (memory address)
        // s1 and s2 point to different heap objects
        // So result is false
        System.out.println("Without equals method : " + (s1 == s2));

        // StringBuilder does NOT override equals() method
        // It inherits equals() from Object class
        // Object.equals() compares references, NOT content
        // So this also behaves exactly like ==
        System.out.println("with equals method : " + s1.equals(s2));

        int a = 10; // unrelated variable, no effect on StringBuilder behavior
    }
}
