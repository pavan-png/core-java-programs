public class String_Eg120 {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = s1.intern();
        String s3 = new String("Java");
        System.out.println(s1==s2);
        System.out.println(s2==s3);
        System.out.println(s3==s1);
    }
}
