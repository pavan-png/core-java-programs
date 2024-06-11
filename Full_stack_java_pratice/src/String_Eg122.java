public class String_Eg122 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("11111");
        StringBuffer sb1 = sb.append(22222).reverse();
        System.out.println(sb1==sb);
        System.out.println(sb);
        System.out.println(sb1);
        StringBuffer s = new StringBuffer("hello");
        StringBuffer s1 = new StringBuffer("hello");
        System.out.println(s1==s);
        StringBuffer s11 = new StringBuffer("hello");
        StringBuffer s12 = s11.append("@");
        System.out.println(s11==s12);
    }
}
