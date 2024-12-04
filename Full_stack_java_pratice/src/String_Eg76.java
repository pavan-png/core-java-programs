class AA{
     public String toString(){
         return null;
    }
    String s  = null;
}
public class String_Eg76 {
    public static void main(String[] args) {
        String text = null;

        text = text + new AA();
        // when we try to print the reference toString() is automatically called.

        System.out.println(text.length());


    }
}
