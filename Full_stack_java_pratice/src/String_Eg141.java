public class String_Eg141 {

    // Instance variable: array of primitive boolean
    // When the object is created, this array is also created
    // Default value of primitive boolean is false
    // Hence all elements are initialized to false
    boolean[] b = new boolean[2];

    public static void main(String[] args) {

        // Creating object of String_Eg141
        // This automatically creates all instance variables
        // including the boolean[] array 'b'
        String_Eg141 obj = new String_Eg141();

        // Accessing array elements using object reference
        // b[0] and b[1] both contain default value false
        System.out.println(obj.b[0] + " : " + obj.b[1]);  // false : false

        // NOTE:
        // Primitive types get their default values automatically
        // boolean → false
    }
}
