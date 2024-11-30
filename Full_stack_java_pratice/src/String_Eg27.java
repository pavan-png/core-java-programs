public class String_Eg27 {
    public static void main(String[] args) {
        final StringBuffer s = new StringBuffer("Hello");
        s.append("pavan");
        System.out.println(s);
       /*
       s = new StringBuffer("someone");
       since s is final it can't be reassigned, operations can be performed on it, but new object cant be created
       with that reference
        */


    }
}
