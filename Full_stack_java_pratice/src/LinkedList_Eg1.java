import java.util.LinkedList;

public class LinkedList_Eg1 {
    public static void main(String[] args) {
        LinkedList ll1 = new LinkedList();
        ll1.add(10);
        ll1.add("pavan");
        ll1.add(20);
        // heterogenous data
        System.out.println(ll1);

        // index based object creation
        ll1.addFirst("hello");
        System.out.println(ll1);

        ll1.addLast("bye");
        System.out.println(ll1);

        // duplicates are allowed
        ll1.add(20);
        System.out.println(ll1);

        LinkedList ll2 = new LinkedList();
        ll2.add(2);

        // one collection can be added to another collection in LinkedList
        ll2.addAll(0,ll1);
        System.out.println(ll2);

    }
}
