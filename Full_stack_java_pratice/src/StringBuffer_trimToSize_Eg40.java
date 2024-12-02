public class StringBuffer_trimToSize_Eg40 {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer(1000);
        System.out.println(s.capacity());
        s.append("Hello");
        System.out.println(s);
        System.out.println(s.length());
        System.out.println(s.capacity());
        s.trimToSize();
        System.out.println(s.capacity());

    }
}
