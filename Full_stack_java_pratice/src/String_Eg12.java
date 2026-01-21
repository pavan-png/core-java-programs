public class String_Eg12 {
    public static void main(String[] args) {

        // Creating a character array
        // Arrays in Java are objects and are stored in HEAP
        char[] c = {'p','a','v','a','n'};

        // getClass().getName() gives the runtime class name of the object
        // For a char array, the class name is [C
        // [  -> array
        // C  -> char type
        System.out.println("class of c is " + c.getClass().getName());

        // Creating a String object from the char array
        // This creates a NEW String object in HEAP
        // Content will be "pavan"
        String s1 = new String(c);

        // Prints the runtime class name of s1
        // Output will be java.lang.String
        System.out.println("class of s1 is " + s1.getClass().getName());

        // Prints the content of the String object
        System.out.println(s1);

        // intern() checks the String Constant Pool (SCP)
        // If "pavan" exists in SCP, it returns the SCP reference
        // Otherwise, it adds "pavan" to SCP and returns that reference
        String s2 = s1.intern();

        // String literal "pavan" is stored in SCP
        String s3 = "pavan";

        // == compares references (memory addresses)
        // s2 and s3 both point to the SAME SCP object "pavan"
        // So the result is true
        System.out.println(s2 == s3);
    }
}
