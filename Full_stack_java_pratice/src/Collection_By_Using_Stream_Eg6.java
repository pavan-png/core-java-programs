import java.util.ArrayList;
import java.util.Comparator;

public class Collection_By_Using_Stream_Eg6 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(5);
        al.add(90);
        al.add(50);
        al.add(35);
        al.add(45);

        // lambda expression can be written as
        Comparator<Integer> c = ( i1, i2)->{
            return i1.compareTo(i2);
        };

        Integer i = al.stream().min((i1,i2)->i1.compareTo(i2)).get();
        /*
        min() method takes comparator as the argument . so implementation for compare() method is given as
        lambda expression.  and get() method is  used tpo get the element
         */

        System.out.println(i);

    }
}
