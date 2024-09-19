import java.util.ArrayList;

public class Genrics_Basix_Example {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("hello");
        al.add("pavan");
        al.add("how");
        al.add("are");
        al.add("you");
        // al.add(10) gives compile time error.
        System.out.println(al);
    }
}
