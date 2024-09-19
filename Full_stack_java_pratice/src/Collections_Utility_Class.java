import java.util.ArrayList;
import java.util.Collections;

public class Collections_Utility_Class {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(25);
        al.add(78);
        al.add(10);
        al.add(87);
        al.add(50);
        al.add(47);
        al.add(56);
        System.out.println(al);
        System.out.println("using collections sort method ");
        Collections.sort(al);

        // there is no need store the sorted data ,it gets updated in the collection itself.
        System.out.println(al);

        // returns the max element in the collection
        System.out.println(Collections.max(al));

        // shuffles the order in the collection
        Collections.shuffle(al);
        System.out.println(al);


        // work more on this
        System.out.println(Collections.binarySearch(al,0));
        // searches the specified list for the specified object using binary search algorithm

        System.out.println(Collections.frequency(al,78));
        // returns no of times the element occured.



    }
}
