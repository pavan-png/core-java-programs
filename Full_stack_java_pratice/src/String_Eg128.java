public class String_Eg128 {
    static String s;
    public static void main(String[] args) {
         //= null;
        System.out.println(s.isBlank());
        // null is the default value assigned to a String variable , here object is not created and we are trying to perform operation
        // on that so it results in the NullPointerException
    }
}
