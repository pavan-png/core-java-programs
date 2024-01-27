public class String_Eg64 {
    public static void main(String[] args) {
        String s1 = "hello";

        // since direct literals evaluation is done at compile time .
        String s2 = "hello" + ""; // so => Hello
        System.out.println(s1==s2);
    }
}
