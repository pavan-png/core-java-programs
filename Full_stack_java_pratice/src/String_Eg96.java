public class String_Eg96 {
    public static void main(String[] args) {
        String s = "java";
        String s1 = "pavan";
        StringBuilder s2 = new StringBuilder("java");
        System.out.println(s.equals(s1));
        System.out.println(s.equals(s2)  + " :  " + s2.equals(s));
    }
}
