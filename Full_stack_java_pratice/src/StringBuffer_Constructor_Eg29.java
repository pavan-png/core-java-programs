public class StringBuffer_Constructor_Eg29 {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer(10);
        System.out.println(s.length());
        System.out.println(s.capacity());
        s.append("pavan");
        System.out.println(s.length());
        System.out.println(s.capacity());
        s.append( "kalyan");
        System.out.println(s.length());
        System.out.println(s.capacity());
    }
}
