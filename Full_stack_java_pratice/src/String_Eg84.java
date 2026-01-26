public class String_Eg84 {
    public static void main(String[] args) {

        // "java" is a string literal
        // It is stored in the String Constant Pool (SCP)

        // new String("java") creates a new String object
        // It is stored in the Heap memory

        // == operator compares memory references (addresses), not content

        // Since both references point to different memory locations,
        // the result will be false
        System.out.println("java" == new String("java")); // false
    }
}
