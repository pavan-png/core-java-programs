public class String_Eg93 {
    public static void main(String[] args) {
        String text = "Hello";
         // evaluation happens from leftside of r.h.s
        text = text + (text = "pavan");
        System.out.println(text);
    }
}
