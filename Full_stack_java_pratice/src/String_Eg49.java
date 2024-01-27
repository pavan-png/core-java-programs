public class String_Eg49 {
    public static void main(String[] args) {
        String s = " ";
        s.trim();
        // space is not counted as empty
        // trim will not remove the spaces in between string , it will  remove spaces only in starting and ending
        System.out.println(s.equals("") + " " + s.isEmpty() );
    }
}
