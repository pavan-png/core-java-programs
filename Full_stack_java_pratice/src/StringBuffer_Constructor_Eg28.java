public class StringBuffer_Constructor_Eg28 {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer();
        System.out.println(s.length());
        s.append("abcdefghijklmnop");
        System.out.println(s.length());
        System.out.println(s.capacity());
        s.append('q');
        System.out.println(s.length());
        System.out.println(s.capacity());
    }
}
