public class StringBuffer_ensureCapacity_Eg41 {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer();
        System.out.println(s.capacity());
        s.ensureCapacity(100);
        System.out.println(s.capacity() );
    }
}
