import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Collection_By_Using_Stream_Eg5 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(5);
        al.add(90);
        al.add(50);
        al.add(35);
        al.add(45);


       // the comparator can be written as
        Comparator<Integer> a = (i1 , i2)->{
            return i2.compareTo(i1);
        };


        List<Integer> l = al.stream().sorted((i1,i2)->i2.compareTo(i1)).collect(Collectors.toList());
        /*
        sorted() method takes the comparator as the argument
       Internally Comparator obj.compareTo(obj) method  will be called , based on that balanced binary tree
       will be created.  Based on the balanced binary tree elements gets sorted and internally LVR
       technique is used and the result gets stored
     */
        l.forEach(System.out::println);

         // method reference, this can be passed as the argument to the forEach().
        // println() method body is stored in apply() method of Consumer
        Consumer c = System.out::println;
    }
}
