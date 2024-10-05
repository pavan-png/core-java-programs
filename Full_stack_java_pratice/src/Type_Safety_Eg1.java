import java.util.ArrayList;
public class Type_Safety_Eg1 {
    public static void main(String[] args) {
        ArrayList al =new ArrayList();
        al.add("pavan");
        al.add("kalyan");
        al.add(new Integer(10));
        String name1 = (String)al.get(0);
        String name2 = (String)al.get(1);
        String name3 = (String)al.get(2);//Exception in thread "main" :: java.lang.ClassCastException java.lang.Integer cannot be cast to java.lang.String

        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name3);
    }
}
