public class String_Eg118 {
    public static void main(String[] args) {

        // new String("Welcome to JavaTpoint")
        // creates a NEW String object in Heap memory

        // intern() checks the String Constant Pool (SCP)
        // If the same content is already present in SCP,
        // it returns the reference of that SCP object
        // Otherwise, it adds the string to SCP and returns its reference
        String str = new String("Welcome to JavaTpoint").intern(); // statement - 1

        // Again a new Heap object is created first
        // intern() is called on it
        // Since "Welcome to JavaTpoint" already exists in SCP
        // intern() returns the SAME SCP reference as above
        String str1 = new String("Welcome to JavaTpoint").intern(); // statement - 2

        // Both str and str1 point to the SAME object in SCP
        // Hence reference comparison returns true
        System.out.println(str1 == str);   // true
    }
}
