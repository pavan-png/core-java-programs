public class String_Eg126 {
    public static void main(String[] args) {
        String s = "java j2ee Spring Hibernate Sql";
        String s1 = "python java scala c c++";
        System.out.println(s.contains("HTML")==s1.contains("HTML"));
        // false == false => true.
        String s2 = " hello pavan how are you";
        System.out.println(s2.contains("pavan"));

    }
}
