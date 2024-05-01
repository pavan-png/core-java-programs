public class String_Eg105 {
    public static void main(String[] args) {
        String s1 = "SCP";
        String s2 = "scp";
        System.out.println(s1.length() == s2.length());
        System.out.println(s1.equalsIgnoreCase(s2));
    }
}
