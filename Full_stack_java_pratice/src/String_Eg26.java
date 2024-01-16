public class String_Eg26 {
    public static void main(String[] args) {
        String s1 = new String("pavan");
        String s2 = s1.toString();
        String s3 = s1.toUpperCase();
        String s4 = s1.toLowerCase();
        String s5 = s1.toUpperCase();
        String s6 = s1.toLowerCase();
        String s7 = s1.toUpperCase();
        System.out.println(s1==s6);
        System.out.println(s3==s5);
        System.out.println(s5==s7);
    }
}
