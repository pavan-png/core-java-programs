public class String_Eg106 {
    public static void main(String[] args) {
        String text = "ONE ";
        System.out.println(text.concat(text.concat("ELEVEN ")).trim());
        //since concatenation is done but in the new object so text = ONE remains same.
    }
}
