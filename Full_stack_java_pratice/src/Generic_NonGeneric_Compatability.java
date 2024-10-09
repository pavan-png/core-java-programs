import java.util.ArrayList;

public class Generic_NonGeneric_Compatability {
    public static void main(String[] args) {
        // working with Generic code v1.5
        ArrayList<String> al = new ArrayList<String>();
        al.add("hello");
        al.add("pavan");
        al.add("kalyan");
        // al.add(10)   C.E cant  find symbol
        m1(al);
        System.out.println(al);
    }

    public static void m1(ArrayList al){
        // working with the non generic code v1.4
        al.add(10);
        al.add(10.5);
        al.add("Rolls royce ");
    }

}
