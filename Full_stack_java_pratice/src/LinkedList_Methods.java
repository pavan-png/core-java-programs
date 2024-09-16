import java.util.LinkedList;

public class LinkedList_Methods {
    public static void main(String[] args) {
        LinkedList ll1 = new LinkedList();
        ll1.add(11);
        ll1.add(22);
        ll1.add(33);
        ll1.add(44);
        ll1.add(55);
        ll1.add(22);
        ll1.add(55);
        System.out.println(ll1);

        System.out.println(ll1.getFirst());
        // returns the first element in the Linkedlist ( i.e 0th index )

        System.out.println(ll1.getLast());
        // return the last element in the LinkedList

        System.out.println(ll1.indexOf(22));
        // returns of the index of first occurance of the specified element

        System.out.println(ll1.lastIndexOf(55));
        // returns the index of last occurance of the specified element

        System.out.println(ll1.offerFirst(90));
        //may (or) may not insert the element at the 0th index

        System.out.println(ll1);

        System.out.println(ll1.offerLast(58));
        //may (or) may not insert the element at the last index

        System.out.println(ll1);

        ll1.addFirst(25);
        //compulsorily adds the element at the 0th index

        ll1.addLast(77);
        //compulsorily adds the element at the last index

        System.out.println(ll1);

        System.out.println(ll1.peekFirst());
        System.out.println(ll1);
        // retrieves but does not remove the First element ( 0th index) of the LinkedList


        System.out.println(ll1.pollFirst());
        System.out.println(ll1);
        // retrieves but removes the first element (0th index) of the LinkedList





    }
}
