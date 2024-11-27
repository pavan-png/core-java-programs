public class String_Eg146 {
    public static void main(String[] args) {
        String s1 = new String("pavan");
        s1.concat("kalyan");
        s1 += " millionarie ";
        String s2 = s1.concat(", billionarie");
        System.out.println(s1);
        System.out.println(s2);
    }
}
