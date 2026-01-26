public class String_Eg92 {
    public static void main(String[] args) {

        // Creates a StringBuilder object with initial capacity 5
        // Capacity means how many characters it can hold without resizing
        // Content is empty, so length = 0
        StringBuilder sb = new StringBuilder(5);

        // Creates an empty String
        // This string has length = 0
        String s = "";

        // equals() method of StringBuilder is NOT overridden
        // So this equals() comes from Object class
        // It compares references (memory address), not content
        // sb and s are different objects, so this condition is false
        if (sb.equals(s)) {
            System.out.println("match 1");
        }

        // sb.toString() converts StringBuilder to String
        // s.toString() returns the same String
        // Now both are String objects with content ""
        // String.equals() compares content, not reference
        // "" equals "" → true
        else if (sb.toString().equals(s.toString())) {
            System.out.println("match 2");
        }

        // This block will not execute because the above condition is true
        else {
            System.out.println("match");
        }
    }
}
