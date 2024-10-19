import java.util.function.Consumer;
import java.util.stream.Stream;

public class Collection_By_Using_Stream_Eg9 {
    public static void main(String[] args) {

        // we can also get Stream for group of values
        Stream s = Stream.of(99,45,54,56,67,75,89);
        s.forEach(System.out ::println);
        System.out.println("===============================================================");
        String[] arr = {"pavan", "bought ","costliest","private","jet","in","the","world"};
        Stream s1 = Stream.of(arr);
        s1.forEach(System.out ::println);

       // method reference println() boody is stored in the accept() method of Consumer
        Consumer c = System.out::println;


    }
}
