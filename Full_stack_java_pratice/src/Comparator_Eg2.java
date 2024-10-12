import java.util.Comparator;
import java.util.TreeSet;

public class Comparator_Eg2 {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Integer i1 = (Integer) o1;
                Integer i2 = (Integer) o1;
                return +1;

            }
        });
        ts.add(10);
        ts.add(0);
        ts.add(15);
        ts.add(5);
        ts.add(20);
        ts.add(20);
        System.out.println(ts);

    }
}
