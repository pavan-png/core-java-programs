public class String_Eg31 {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("Hello");
        System.out.println(s.charAt(3));
        System.out.println(s.charAt(-1));  // Even though it is a Stringbuffer
        // and basically it is  String  the exception is StringIndexOutOfBoundsException
    }
}
