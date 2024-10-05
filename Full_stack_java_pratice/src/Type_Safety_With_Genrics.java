import java.util.ArrayList;
public class Type_Safety_With_Genrics {
    public static void main(String[] args) {
        ArrayList<String> al =new ArrayList<String>();
        al.add("pavan");
       //  al.add(10);     CE: can't find symbol symbol: method add(int) location: class
        //  java.util.ArrayList<java.lang.String> I



    }
}
