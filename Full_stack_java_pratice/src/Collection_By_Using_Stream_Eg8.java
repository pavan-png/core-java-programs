import java.util.ArrayList;
import java.util.function.IntFunction;
import java.util.stream.Collectors;

public class Collection_By_Using_Stream_Eg8 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(5);
        al.add(90);
        al.add(50);
        al.add(35);
        al.add(45);
        // here toArray() returns the array of Object type to convert that into Integer type ,
        Object[] arr = al.stream().toArray();
        for (Object a:arr){
            System.out.println(a);
        }
        System.out.println("===========================================");
      Integer[] i=   al.stream().toArray(Integer[]::new);

      /*
      Intfunction is a functional interface consists of apply() method , apply method takes int data as argument
      and returns data as an array . by using the constructor reference we are storing Intfunction body in
      the constructor of Integer[].
      array
      */
        // the above argument in toArray() method can be written as
        IntFunction f  = Integer[] ::new;


        for (Object a:i){
            System.out.println(a);
        }
    }
}
