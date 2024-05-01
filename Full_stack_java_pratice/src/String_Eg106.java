public class String_Eg106 {
    public static void main(String[] args) {
        String text = "ONE ";
        System.out.println(text.concat(text.concat("ELEVEN ")).trim());
    }
}
