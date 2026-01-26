public class String_Eg140 {

    // Array of wrapper class Boolean
    // Default value of each element is null
    Boolean[] b1 = new Boolean[3];

    // Primitive boolean variable
    // Default value is false
    boolean b2;

    public static void main(String[] args) {

        // Local array of wrapper class Boolean
        // Each element is an object reference
        // Default value of wrapper object is null
        Boolean[] b = new Boolean[2];

        // Accessing null values is allowed
        // We are NOT calling any method on null
        // Hence NO NullPointerException
        System.out.println(b[0] + " : " + b[1]);   // null : null


        // Creating object to access instance variables
        String_Eg140 obj = new String_Eg140();

        // b1 is an instance variable
        // Default values are assigned automatically
        // Each element is null
        System.out.println(
                obj.b1[0] + " : " + obj.b1[1] + " : " + obj.b1[2]
        );  // null : null : null


        // b2 is a primitive boolean instance variable
        // Default value is false
        System.out.println(obj.b2);   // false
    }
}
