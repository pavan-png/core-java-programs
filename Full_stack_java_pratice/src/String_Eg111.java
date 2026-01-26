public class String_Eg111 {
    public static void main(String[] args) {

        // StringBuilder is a mutable class
        // It allows changes to the same object without creating a new one
        StringBuilder sb = new StringBuilder("HELLO");

        // reverse() is a method of StringBuilder
        // It reverses the content of the SAME StringBuilder object
        // After reverse(), sb becomes "OLLEH"
        sb.reverse();

        // replace(String, String) is NOT a method of StringBuilder
        // That replace() belongs to the String class
        // Hence calling replace("O","A") on StringBuilder causes compile-time error

        // System.out.println(sb.reverse().replace("O","A"));  // ❌ compile-time error

        // To use replace(), we must first convert StringBuilder to String
        String s = sb.toString();  // converts "OLLEH" to String object

        // replace() works here because s is a String
        // A NEW String object is created with the replaced value
        System.out.println(s.replace("O", "A")); // prints "ALLEH"
    }
}
