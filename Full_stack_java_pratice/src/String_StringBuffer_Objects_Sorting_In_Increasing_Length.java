import java.util.Comparator;
import java.util.TreeSet;

class MyComparator_6 implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        String s1 =  o1.toString();
        String s2 = o2.toString();
        /* to type cast there must be parent child relation
        but there is no relation b\w String and StringBuffer so it leads to ClassCastException
         */
        Integer i1 = s1.length();
        Integer i2 = s2.length();

        if (i1 > i2) {
            return +1;
        } else if (i1 < i2) {
            return -1;
        } else
            return s1.compareTo(s2);
        // compareTo() method checks works on alphabetical order ( first letter of string object )

    }
}
public class String_StringBuffer_Objects_Sorting_In_Increasing_Length {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet(new MyComparator_6());
        ts.add("A");
        ts.add("ABC");
        ts.add(new StringBuffer("AA"));
        ts.add("XX");
        ts.add(new StringBuffer("ABCE"));
        ts.add ("A");
        System.out.println(ts);
    }
}
