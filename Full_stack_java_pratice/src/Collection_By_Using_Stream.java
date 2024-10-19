import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Collection_By_Using_Stream {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(0);
        al.add(5);
        al.add(10);
        al.add(15);
        al.add(20);
        al.add(25);
        al.add(30);
        al.add(35);
        al.add(40);

        /*
        to use the stream api 2 steps needs to be performed
        1.configuration
        2.processing
         */

        // jdk 1.8v
        Stream s = al.stream();
        System.out.println(s.getClass().getName());
        // givens the name of the class

        /*
        parameters data type declaration is not needed in lambda so i datatype is not declared
         return type should be omitted if there are no curly braces
         */
       List<Integer> l =   al.stream().filter(i->i%2==0).collect(Collectors.toList());
       /*                  1. configuration     2. processing             3. collect
          stream() method is called on collection object
          filter() method accepts predicate type , internally test method is  called implementation, for test method
          is given as lambda expression
          using collect() method to collect the processed data. and it accepts the argument of Collectors type.
          using toList() method to store them in list.
        */

        l.forEach(System.out::println);
        System.out.println("-----------------------------------------");

        // both are same
        Consumer c = System.out::println;
        l.forEach(c);


    }
}
