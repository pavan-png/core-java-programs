import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Collection_By_Using_Stream_Eg3 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("pavan");
        al.add("Anand");
        al.add("Tarun");
        al.add("charan");
        al.add("Teja");

        // lambda expression can also be written as
        Predicate<String> p = (String s)->{
            return s.length()>5;
        };

      Long l =   al.stream().filter(name->name.length()>5).count();
        System.out.println("the no. of objects whose string length is greater than 5 is : "+l);

        List<String> l1 = al.stream().filter(s->s.length()>5).collect(Collectors.toList());
        System.out.println(l1.size());
    }
}
