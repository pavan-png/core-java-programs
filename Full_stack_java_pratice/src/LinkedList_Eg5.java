import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedList_Eg5 {
    public static void main(String[] args) {

        LinkedList<String> orders = new LinkedList<>();

        orders.add("Order1");
        orders.add("Order2");
        orders.add("Order3");

        // forEach() → most used in modern code
        System.out.println("Using forEach:");
        orders.forEach(order -> System.out.println(order));

        // iterator() → used when manual control needed
        System.out.println("\nUsing Iterator:");
        Iterator<String> it = orders.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // listIterator() → forward + backward
        System.out.println("\nUsing ListIterator (reverse):");
        ListIterator<String> listIt = orders.listIterator(orders.size());

        while (listIt.hasPrevious()) {
            System.out.println(listIt.previous());
        }
    }
}
