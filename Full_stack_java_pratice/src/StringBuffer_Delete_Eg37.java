public class StringBuffer_Delete_Eg37 {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("Hello pavan wo1rld");
        s.delete(5,12);
        System.out.println(s);
        s.deleteCharAt(7);
        System.out.println(s);
    }
}
