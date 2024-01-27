public class String_Eg54 {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = new String("java");
        String s3 = s2;
        if (s3.equalsIgnoreCase(s2)){
            System.out.println("equal");
        }
        else {
            System.out.println("not equal");
        }
    }
}
