import java.util.ArrayList;
import java.util.Iterator;

class Test_9{
    public void m1(ArrayList<? super Integer> al){
        Iterator it = al.listIterator();
        while (it.hasNext()){
            System.out.print(it.next() + "   ");
        }
        al.add(null);

    }
}
public class Generic_Method_With_Wild_Card_Pattern_Eg4 {
    public static void main(String[] args) {
        ArrayList<Number> al = new ArrayList<Number>();
        /*
        here type parameter can be only be of same (or) its parent (or) grand parent as
         mentioned in method m1 parameter. if you try to give the type parameter other than that ,
         it would result in the compile time error.

         */
        al.add(25);
        al.add(45);
        al.add(87);
        al.add(14);
        al.add(25);
        Test_9 obj = new Test_9();
        obj.m1(al);


    }
}
