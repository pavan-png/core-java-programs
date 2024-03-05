public class String_Eg73 {
    public static void main(String[] args) {
        String ta = "A";
        ta  = ta.concat("B");
        String tb = "C";
        ta = ta.concat(tb);
        ta.replace('C','D');
        ta = ta.concat(tb);
        System.out.println(ta);
    }
}
