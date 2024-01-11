public class String_Eg12 {
    public static void main(String[] args) {
        char[] c = {'p','a','v','a','n'};
        String s1 = new String(c);
        System.out.println(s1);
        String s2 = s1.intern();
        String s3 = "pavan";
        System.out.println(s2==s3);
    }
}
