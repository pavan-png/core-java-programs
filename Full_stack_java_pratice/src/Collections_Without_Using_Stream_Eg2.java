import java.util.ArrayList;

public class Collections_Without_Using_Stream_Eg2 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("net");
        al.add("worth");
        al.add("of");
        al.add("pavan");
        al.add("is");
        al.add("hundred");
        al.add("crores ");
        al.add("inr");

        ArrayList<String> al1 = new ArrayList<>();
        for(String s : al){
            al1.add(s.toUpperCase());
        }
        System.out.println(al1);
    }
}
