public class String_Eg102 {
    public static void main(String[] args) {
        final int i1 = 1;
        final Integer i2 = 1;
        final String s1 = ":One";

        String p1 = "hello";
        // == checks the object , since p1 is in s.c.p , "hello" literal uses the p1 object , and since both
        // are pointing to same object the result is true.
        System.out.println(p1=="hello");

        String str1 = i1 + s1;
        String str2 = i2 + s1;

        System.out.println(str1 == "1:One");
        System.out.println(str2 == "1:One");


    }
}
