import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.TreeSet;

public class Ways_For_Traversing_Collections {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(25);
        al.add(78);
        al.add(10);
        al.add(87);
        al.add(50);

        // using for and for each loop you can  traverse only collections which are index based.
        System.out.println("using for loop");
        for (int i = 0 ; i<al.size();i++){
            System.out.print(al.get(i)+ "   "); // get method is used to access the elements
        }
        System.out.println();
        System.out.println("using for each");
        for(Object obj :al){
            System.out.print(obj + "   ");
        }

        System.out.println();
        System.out.println("using iterator ");
        /*
        accessing using iterator.
        using iterator you can in traverse all the 7 collections
         */

       Iterator ir = al.iterator();
       /*  instance variable
       here Iterator is a class and by using iterator object (al) we are calling iterator() method.
        */

        while (ir.hasNext()==true){
            System.out.print(ir.next() + "   ");
        }

        System.out.println();
        System.out.println("using list iterator ");
        /*
        accessing using listIterator.
        using listIterator you can in traverse only in 2 collections ArrayList , LinkedList
         */

        ListIterator li = al.listIterator(al.size());

        while (li.hasPrevious()==true){
            System.out.print(li.previous() + "   ");

        }

        System.out.println();
        System.out.println("to traverse in the reverse direction other than ArrayList and LinkedList this method is used");
        /*
        to traverse in the reverse direction other than ArrayList and LinkedList this method is used
            add any collection to ArrayList (or) Linked list  using addAll() method and traverse using
            list -iterator
         */

        TreeSet ts = new TreeSet();
        ts.add(20);
        ts.add(5);
        ts.add(10);
        ts.add(17);

        System.out.println("treeset collection : " + ts);
        ArrayList al1 = new ArrayList();
        al1.addAll(ts);
        ListIterator li1 = al1.listIterator(al1.size());
        while (li1.hasPrevious()==true){
            System.out.print(li1.previous() + "   ");
        }
    }
}
