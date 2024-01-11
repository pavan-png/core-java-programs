public class String_Eg13 {
    public static void main(String[] args) {
        byte[] b = {65,66,67,68};
        String s1 =new String(b);
        System.out.println(s1);
        String s2 = s1.intern();
        String s3 = "ABCD";
        System.out.println(s2==s3);
    }
}
