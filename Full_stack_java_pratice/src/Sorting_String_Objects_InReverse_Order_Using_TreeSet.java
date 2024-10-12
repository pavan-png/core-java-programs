import java.util.Comparator;
import java.util.TreeSet;

class MyComparator_4 implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        String s1 = (String) o1;
        String s2 = o2.toString();
        return s2.compareTo(s1);
    }
}
public class Sorting_String_Objects_InReverse_Order_Using_TreeSet {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet(new MyComparator_4());
        ts.add("pavan");
        ts.add("Anand");
        ts.add("charan");
        ts.add("pavan");
        ts.add("tarun");
        System.out.println(ts);
    }
}
