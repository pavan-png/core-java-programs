import java.util.TreeSet;

public class Comparable_Using_TreeSet_Basic_Example {
    public static void main(String[] args) {
        // sorting of objects will happen based on the default natural sorting order
        // inside TreeSet you should give homogenous data otherwise it results in ClassCastException
        TreeSet<String> ts = new TreeSet<String>();
        ts.add("A"); //  internally  A.compareTo(Z)  it is a method of Comparable
        ts.add("Z");
        ts.add("L");
        ts.add("B");
        System.out.println(ts);
    }
}
