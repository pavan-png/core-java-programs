public class StringBuffer_Constructor_Eg30 {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("Hi");
        System.out.println(s.length());
        System.out.println(s.capacity());
        s.append("abcdefghijklmnopq");
        System.out.println(s.length());
        System.out.println(s.capacity());
    }
}

