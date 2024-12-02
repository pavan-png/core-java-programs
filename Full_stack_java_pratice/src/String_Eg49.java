public class String_Eg49 {
    public static void main(String[] args) {
        String s = " ";
        s.trim();
        // operation is performed but reference is not collected so garbage collector will clean it
        // space is not counted as empty
        // trim will not remove the spaces in between string , it will  remove spaces only in starting and ending
        System.out.println(s.equals("") + " " + s.isEmpty() );
        // "" is not treated as empty.
    }
}
