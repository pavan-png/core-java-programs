import java.util.ArrayList;
import java.util.function.Consumer;

public class Consumer_Apply_Method_With_Method_Reference {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList();
        al.add("pavan");
        al.add("bought");
        al.add("a");
        al.add("Shopping");
        al.add("complex");
        al.add("in");
        al.add("Amaravathi");

        al.forEach(System.out::println);

        System.out.println("================================");
        // this code is same as above
        Consumer s = System.out::println;

        /*
        method reference for instance method
        println() method body is given to apply() method
         */

        al.forEach(s);
        /*
         forEach() method is applied on ArrayList object.
         it access the data one by one
         it takes the consumer object as argument.
         */

    }
}
