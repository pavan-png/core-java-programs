public class String_Eg13 {
    public static void main(String[] args) {
        byte[] b = {65,66,67,68};
        System.out.println("type of c is "+b.getClass().getName());
        String s1 =new String(b); // takes the equivalent characters for numbers and stores them as string
        System.out.println(s1);
        System.out.println("type of s1 is "+s1.getClass().getName());
        String s2 = s1.intern();
        String s3 = "ABCD";
        System.out.println(s2==s3);
    }
}
