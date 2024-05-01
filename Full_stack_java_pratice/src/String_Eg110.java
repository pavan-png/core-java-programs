public class String_Eg110 {
    public static void main(String[] args) {
        String str = "PAVAN";

        // first inner braces are evaluated
        System.out.println(str.charAt(str.indexOf("A")+1));
    }
}
