public class String_Eg102 {
    public static void main(String[] args) {
        final int i1 = 1;
        final int i2 = 1;
        final String s1 = ":One";

        String p1 = "hello";
        // == checks the object reference , as it is a literal it is present in s.c.p, and p1 is pointing
        // hello object, as both the address are same it returns true
        System.out.println(p1=="hello");

        String str1 = i1 + s1;
        String str2 = i2 + s1;
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str1==str2);
        System.out.println(str1 == "1:One");
        System.out.println(str2 == "1:One");
        // if primitives are used only then space is allocated in s.c.p , if wrapper classes are used space is
        //is allocated in heap

        String s3 = "hello" +"hi";
        String s4 = "hello"+"hi";
        // since literals are involved and concat only concat operation is made with operator, space is allocated directly in the s.c.p
        System.out.println("s3==s4");
        System.out.println( s3==s4);

        String s5 = "hi".concat("hello");
        String s6 = "hi".concat("hello");
        System.out.println(s5==s6);
        // even though literals are involved. if a method/ runtime operation is involved space is allocated in heap





    }
}
