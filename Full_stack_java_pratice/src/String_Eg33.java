public class String_Eg33 {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("Hello");
        String s1 = "Hello";
        if (s.toString().equals(s1.toString()))
            System.out.println("Match = -1");
        else if (s.equals(s1))
            System.out.println("Match = -2");
        else
            System.out.println("no match");
    }
}
