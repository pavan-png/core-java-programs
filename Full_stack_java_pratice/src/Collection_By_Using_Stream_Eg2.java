import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Collection_By_Using_Stream_Eg2 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("pavan");
        al.add("owns");
        al.add("3");
        al.add("multiplex");
        al.add("in");
        al.add("mmumbai");

       // the same lambda expression in map method can be written as
        Function<String,String> f = (String s)->{
          return s.toUpperCase();
        };

        List<String> l =            al.stream().map(name ->name.toUpperCase()).collect(Collectors.toList());
        /*                  1. configuration         2. processing             3. collect
          stream() method is called on collection object
          map() method accepts Function type , internally apply method is  called, implementation for apply method
          is given as lambda expression
          using collect() method to collect the processed data. and it accepts the argument of Collectors type.
          using toList() method to store them in list.
        */
        System.out.println(l);

        // method reference
        l.forEach(System.out::println);

        /*
        for each loop accepts Consumer type as a argument . using method reference println() body is given to
        accept() method of consumer

         */

        // the above method reference argument can be written like this
        Consumer s = System.out::println;


    }
}
