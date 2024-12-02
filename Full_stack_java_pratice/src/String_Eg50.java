public class String_Eg50 {
    public static void main(String[] args) {
        // trim will not remove the spaces in between string , it will  remove spaces only in starting and ending
        String s = "SACHIN TENDULKAR";
        System.out.println(s.length());
        int a = s.trim().length();
        System.out.println(a);
    }
}
