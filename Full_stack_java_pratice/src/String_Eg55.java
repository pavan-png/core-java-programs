public class String_Eg55 {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = new String("java");
        if (s1.toLowerCase() == s2.toLowerCase()){
            System.out.println("equal");
        }
        else {
            System.out.println("not equal");
        }
    }
}
