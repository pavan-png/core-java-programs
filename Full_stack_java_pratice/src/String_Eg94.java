public class String_Eg94 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("java");
        String s = sb.toString();
        String s1 = "java";
        System.out.println(s==s1);
    }
}
