import java.util.TreeSet;

public class Comparable_Using_TreeSet_Eg3 {
    public static void main(String[] args) {
       // sorting will happen based on the default natural sorting order
        TreeSet ts = new TreeSet();
        ts.add(new StringBuffer("A"));
        ts.add(new StringBuffer("Z"));
        ts.add(new StringBuffer("L"));
        ts.add(new StringBuffer("B"));
        System.out.println(ts);
    }
}
