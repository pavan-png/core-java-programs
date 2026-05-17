import java.util.ArrayList;

public class ArrayList_Eg4 {
    public static void main(String[] args) {

        ArrayList al1=new ArrayList();
        al1.add(10);
        al1.add(20);
        al1.add(30);
        al1.add(40);

        ArrayList al2=new ArrayList();
        al2.add(10);
        al2.add(20);

        //al1.removeAll(al2);
        //al1.retainAll(al2);

        al1.clear();
        // It removes all elements from the collection (like ArrayList)

        System.out.println(al1);
        System.out.println(al2);
    }
}
