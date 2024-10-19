import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Collection_By_Using_Stream_Eg4 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(5);
        al.add(90);
        al.add(50);
        al.add(35);
        al.add(45);

       List<Integer> l =  al.stream().sorted().collect(Collectors.toList());
       /*
       On a sorted() method w.r.t the list , if you don’t  pass any arguments , whatever objects
       you have added on that default natural sorting order is performed.
       Internally Comparable compareTo() method  will be called , based on that balanced binary tree
       will be created.  Based on the balanced binary tree elements gets sorted and internally LVR
       technique is used and the result gets stored
     */

       l.forEach(System.out::println);

       // method reference, this can be passed as the argument to the forEach().
        // println() method body is stored in apply() method of Consumer
       Consumer c = System.out::println;

    }
}
