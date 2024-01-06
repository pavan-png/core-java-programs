public class String_Eg11 {
    public static void main(String[] args) {
        String s1 = new String("Hello");
        String s2 =  s1.concat(" world");
        String s3 = s2.intern();
        String s4 = "Hello world";
        System.out.println(s3==s4);
    }
}
