import java.util.TreeSet;

public class Comparable_Using_Treeset_Eg2 {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet();
        ts.add("A");
        ts.add("Z");
        ts.add("L");
        ts.add("B");
        ts.add(null);  // NullPointerException
        ts.add(10); // ClassCastException


    }
}
