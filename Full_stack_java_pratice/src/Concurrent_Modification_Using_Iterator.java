import java.util.ArrayList;
import java.util.Iterator;

public class Concurrent_Modification_Using_Iterator {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(25);
        al.add(78);
        al.add(10);
        al.add(87);
        al.add(50);

        Iterator it = al.iterator();
        while (it.hasNext()==true){
            Object obj = (Object) it.next();
            System.out.print(obj+ "    ");
            al.add(78);
        }
    }
}
