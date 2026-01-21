public class String_Eg14 {
    public static void main(String[] args) {

        // Creating a StringBuffer object
        // StringBuffer is MUTABLE
        // The object is created in HEAP
        StringBuffer s = new StringBuffer("Hello");

        // Printing the content of StringBuffer
        // StringBuffer's toString() method is called internally
        System.out.println("String buffer data is " + s);

        // getClass().getName() returns the runtime class name
        // Output: java.lang.StringBuffer
        System.out.println("s is of class " + s.getClass().getName());

        // Creating a String object from StringBuffer
        // new String(StringBuffer) constructor is used
        // Characters from StringBuffer are COPIED
        // A NEW String object is created in HEAP
        // The String object is IMMUTABLE
        String s1 = new String(s);

        // Printing the content of the String
        System.out.println("String method data is " + s1);

        // Printing the runtime class name of s1
        // Output: java.lang.String
        System.out.println("s1 is of class " + s1.getClass().getName());
    }
}
