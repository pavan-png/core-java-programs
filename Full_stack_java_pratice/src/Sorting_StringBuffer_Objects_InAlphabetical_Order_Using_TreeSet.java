import java.util.TreeSet;

public class Sorting_StringBuffer_Objects_InAlphabetical_Order_Using_TreeSet {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet();
        ts.add(new StringBuffer("pavan"));
        ts.add(new StringBuffer("Anand"));
        ts.add(new StringBuffer("charan"));
        ts.add(new StringBuffer("pavan"));
        ts.add(new StringBuffer("tarun"));
        System.out.println(ts);
        // in jdk 17 StringBuffer implements Comparable , so we got the sorted order

    }
}
