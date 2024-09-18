import java.util.TreeSet;

public class TreeSet_Eg1 {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet();
        ts.add(100);
        ts.add(45);
        ts.add(101);
        ts.add(24);
        ts.add(63);
        ts.add(120);
        ts.add(120);
        // we will get sorted order
        System.out.println(ts);

        System.out.println(ts.ceiling(45));
        // if the element is present returns that , else returns the element slightly higher than that

        System.out.println(ts.higher(45));
        // returns  slightly higher element

        System.out.println(ts.floor(45));
        // if the element is present returns that , else returns the element slightly lower than that

        System.out.println(ts.lower(45));
        // returns lightly lower element

    }
}
