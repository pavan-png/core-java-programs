public class String_Eg14 {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("Hello");
        System.out.println("String buffer data is "+s);
        String s1 = new String(s);
        System.out.println("String method data is "+s1);
    }
}
