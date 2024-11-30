public class String_Eg22 {
    public static void main(String[] args) {
        String s = "pavan kalyan";
        System.out.println("String is :" +s);
        System.out.println("length before trim "+s.length());
        String s1 = s.trim();
        System.out.println("length after trim "+s1.length());
        System.out.println("======================================================================");
        String s2 = "  Hello world  ";
        System.out.println("String is  :"+s2);
        System.out.println("length before trim "+s2.length());
        String s3 = s2.trim();
        System.out.println("length after trim "+s3.length());

    }
}
