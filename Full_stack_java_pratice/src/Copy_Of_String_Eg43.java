public class Copy_Of_String_Eg43 {
    public static void main(String[] args) {
        String s = "Hello  pavan";
        String s2 = "";
        for (int i = 0 ; i<s.length();i++){
            s2 = s2 + s.charAt(i);
        }
        System.out.println("Original String : "+s);
        System.out.println("Copy of String : "+s2);
    }
}
