public class String_Operation_On_Same_Object {
    public static void main(String[] args) {
        String s8 = new String ("pavan");
        String s9 = s8.toLowerCase();
        System.out.println(s8==s9);

       String s10 = new String("PAVAN");
       String s11 = s10.toUpperCase();
        System.out.println(s10==s11);

    }
}
