public class String_Eg51 {
    public static void main(String[] args) {
        String s = "Hello world";
        s.trim();
        // index() method count starts from 0 to n , length() starts count from 1 to n .
        int i = s.indexOf(" ");
        System.out.println(i);
    }
}
