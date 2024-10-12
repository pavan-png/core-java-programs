import java.util.Comparator;
import java.util.TreeSet;

class MyComparator_5 implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        String s1 = o1.toString();
        String s2 = (String)o2;
        return s1.compareTo(s2);
    }
}
public class Sorting_String_Objects_InAlphabetical_Order_Using_TreeSet {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet(new MyComparator_5());
        ts.add("pavan");
        ts.add("Anand");
        ts.add("charan");
        ts.add("pavan");
        ts.add("tarun");
        System.out.println(ts);
    }
}
