public class String_Eg95 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("java");
        String s = sb.toString();
        String s1 = sb.toString();
        System.out.println(s == s1);
    }
}
