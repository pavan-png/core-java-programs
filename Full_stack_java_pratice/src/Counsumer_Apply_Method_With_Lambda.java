import java.util.ArrayList;
import java.util.function.Consumer;

public class Counsumer_Apply_Method_With_Lambda {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList();
        al.add("pavan");
        al.add("bought");
        al.add("a");
        al.add("Shopping");
        al.add("complex");
        al.add("in");
        al.add("Amaravathi");

        Consumer<String> obj = (String s)->{
            System.out.println(s);
        };

        al.forEach(obj);
    }
}
