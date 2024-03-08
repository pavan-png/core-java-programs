public class String_Eg77 {
    public static void main(String[] args) {
        String s1 = "Hello";
        // if tou try to print any object java internally invokes toString() on object.
        System.out.println(s1.toString());

        String  s = null;
       //  System.out.println(s.toString()); cannot perform operations on null NullPointerException.
        System.out.println(s);

      //  String s2 = null +null  leads to compilation error.

        s = s+null;

        // from the above step . we can say that variable,null is concatenated as String.
        System.out.println(s);

        // since they are concatenated as Strings . all the String methods can be applied to it.
        System.out.println(s.length());
        System.out.println(s.charAt(2));
    }
}
