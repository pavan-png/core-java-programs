public class String_Eg63 {

    // Overriding the toString() method of Object class
    // This method is automatically called when an object
    // is passed to println()
    public String toString() {
        return "Test run";
    }

    public static void main(String[] args) {

        // Creating an object of String_Eg63
        String_Eg63 obj = new String_Eg63();

        // println(obj) internally calls obj.toString()
        // Since toString() is overridden, it prints "Test run"
        System.out.println(obj);
    }
}
