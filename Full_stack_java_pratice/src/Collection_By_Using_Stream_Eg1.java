import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Collection_By_Using_Stream_Eg1 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(0);
        al.add(5);
        al.add(10);
        al.add(15);
        al.add(20);
        al.add(25);

        /*  parameters data type declaration is not needed in lambda so i datatype is not declared
        return type should be omitted if there are no curly braces
         */
        List<Integer> l    =           al.stream().map(i->i*2).collect(Collectors.toList());
        /*                  1. configuration         2. processing             3. collect
          stream() method is called on collection object
          map() method accepts Function type , internally apply method is  called, implementation for apply method
          is given as lambda expression
          using collect() method to collect the processed data. and it accepts the argument of Collectors type.
          using toList() method to store them in list.
        */
        l.forEach(System.out::println);

        System.out.println("==========================================================");
        Consumer s = System.out::println;
        l.forEach(s);
    }
}
