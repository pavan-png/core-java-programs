import java.util.ArrayList;

public class ArrayList_Methods {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(11);  // add method is used to add data to the collection
        al.add(22);
        al.add(33);
        al.add(44);
        System.out.println(al);
        // returns true if the list contains the element otherwise returns false
        boolean check = al.contains(33);
        System.out.println(check);

        /* in-general it is used for debugging purpose to check whether the control is coming to position or not
        if a method is  not returning anything , we cannot use it in print statement , or store it in left hand side
         */
        System.out.println(al.contains(22));

       // gives the index of the element in the ArrayList
        int index = al.indexOf(33);
        System.out.println(index);

        // checks whether the collection is  empty or not if empty returns true otherwise false
        System.out.println(al.isEmpty());

        al.ensureCapacity(10);
        /*increases the capacity of  the ArrayList instance, if necessary to ensure that it can hold the
        atleast the number of elements specified by the minimum capacity argument
        (capacity it can hold elements in the collection is passed as argument)
         */


        System.out.println(al.size());
        // size method  returns the number of elements that are present in the ArrayList


        al.trimToSize();
        // trims the capacity of the ArrayList to Current size4

        System.out.println(al.getClass());
        //returns the entire path of the ArrayList

        al.clear();
        // removes all the elements from the ArrayList
        System.out.println(al);
        System.out.println(al.size());





    }
}
