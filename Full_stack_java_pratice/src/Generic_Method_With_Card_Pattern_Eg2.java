import java.util.ArrayList;
import java.util.Iterator;

class Test_7{
    public void m1(ArrayList<?> al){
        // ArrayList of any type can be passed as argument to this method
        Iterator it = al.listIterator();
        while (it.hasNext()){
            System.out.print(it.next() + "   ");
        }
        al.add(null);
        // can only add null , cant add elements other than that
    }
}
public class Generic_Method_With_Card_Pattern_Eg2 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        /*
        if the type parameter is not specified then there will be no compile time error.
        if the type parameter is of any specific generic type , it can be passed to as the argument to m1 method
        there is no limitation that only specific type of arraylist  object is passed as argument to m1 method
         */
        al.add("Hello");
        al.add("pavan");
        al.add("kalyan");
        Test_7 obj = new Test_7();
        obj.m1(al);
    }
}
