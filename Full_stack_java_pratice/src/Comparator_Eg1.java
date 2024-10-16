import java.util.Comparator;
import java.util.TreeSet;

class MyComparator implements Comparator{
    @Override
    public int compare(Object obj1 , Object obj2) {
        Integer i1 = (Integer) obj1;
        Integer i2 = (Integer) obj2;
        if (i1<i2){
            return +1;
        }
        else if(i1>i2){
            return -1;
        }
        else
            return 0;


    }

}
public class Comparator_Eg1 {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet( new MyComparator());
        // TreeSet constructor accepts comparator type as argument , check in javap java.util.TreeSet

        /*
        if we create TreeSet object without passing the arguments by default it would implement Comparable interface
        but
        if we create TreeSet object by passing the Comparator object (or) the implementation class object of Comparator
        as the argument to the TreeSet, then The TreeSet follows compartor compare() method. and user
        should manually give implementation for compare() method
         */
        ts.add(10);  // internally  compare(10 ,0 ) is called
        ts.add(0);
        ts.add(15);
        ts.add(5);
        ts.add(20);
        ts.add(20);
        System.out.println(ts);
    }
}
