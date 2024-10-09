import java.util.ArrayList;
import java.util.Iterator;

class Test_8 {
    public void m1(ArrayList<? extends Number > al){
        // means only Number ( or) child's of Number type array list can be passed in this method as argument
        Iterator it = al.listIterator();
        while (it.hasNext()){
            System.out.print(it.next() + "   ");
        }
        al.add(null);

    }
}
public class Generic_Method_With_Wild_Card_Pattern_Eg3 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        /*
        if the type parameter is not specified then there will be no compile time error. if it is specified
         then it should be of same or child type of the parameter of method m1.
         */

        al.add(24);
        al.add(78);
        al.add(41);
        al.add(14);

        Test_8 t = new Test_8();
        t.m1(al);
    }
}
