import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class Concurrent_Modification_With_Concurrent_Package {
    public static void main(String[] args) {
        CopyOnWriteArrayList cal = new CopyOnWriteArrayList();
        cal.add(10);
        cal.add(78);
        cal.add(45);
        cal.add(98);
        cal.add(65);
        cal.add(47);

        Iterator it = cal.iterator();
        while (it.hasNext()==true) {
            Object obj = (Object) it.next();
            System.out.print(obj + "    ");

            cal.add(78);
            /*
             when jvm executes above line it will just stop the execution , without abrupt termination and
            infinite loop
             */

        }
    }
}

