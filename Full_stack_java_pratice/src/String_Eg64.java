public class String_Eg64 {
    public static void main(String[] args) {
        String s1 = "hello";

        // since direct literals evaluation is done at compile time .
        String s2 = "hello" + ""; // so => Hello

        String s3 = "hello pavan";
        String s4 = "hello"+ " pavan";

        System.out.println(s1==s2);
        System.out.println(s3==s4);
    }
}
