public class String_Eg121 {
    public static void main(String[] args) {
        String str1  = "Java";
        String str2 = str1.intern();
        System.out.println(str1==str2);
        System.out.println(str1.equals(str2));
    }
}
