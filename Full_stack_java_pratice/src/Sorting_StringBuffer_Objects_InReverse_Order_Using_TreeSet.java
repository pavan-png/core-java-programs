import java.util.Comparator;
import java.util.TreeSet;

class MyComparable_5 implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        String s1 = o1.toString();
        String s2 = o2.toString();
        /* String s3 = (String)o2
        to type cast there must be parent - child relationship

         */
        return s2.compareTo(s1);
    }
}
public class Sorting_StringBuffer_Objects_InReverse_Order_Using_TreeSet {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet(new MyComparable_5());
        ts.add(new StringBuffer("pavan"));
        ts.add(new StringBuffer("Anand"));
        ts.add(new StringBuffer("charan"));
        ts.add(new StringBuffer("pavan"));
        ts.add(new StringBuffer("tarun"));
        System.out.println(ts);
    }
}
