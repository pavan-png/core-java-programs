import java.util.ArrayList;

public class ArrayList_Eg3 {
    public static void main(String[] args) {
        ArrayList al=new ArrayList();

        al.add(10);
        al.add(50);
        al.add(80);
        al.add("deepak");
        al.add(90);
        al.add(20);

        //Use clear() → when you want to reset/empty the list
        al.removeAll(al);

        System.out.println(al);
    }
}
