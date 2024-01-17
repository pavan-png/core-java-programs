public class String_Eg32 {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("Helloworld");
        s.setCharAt(5,'W');
        // replace the character  at particular index
        // don't use setCharAt() in print method .
        System.out.println(s);
    }
}
