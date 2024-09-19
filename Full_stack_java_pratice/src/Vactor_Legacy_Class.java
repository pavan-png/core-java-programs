import java.util.Enumeration;
import java.util.Vector;

public class Vactor_Legacy_Class {
    public static void main(String[] args) {
        // vectors are not used now learn them as optional. z

        Vector v = new Vector();
        v.add(120);
        v.add(87);
        v.add(50);
        v.add(90);
        v.add(100);
        v.add(40);

        Enumeration e = v.elements();
        // class similar to Iterator  used to iterate elements only for vector

        while(e.hasMoreElements() == true){
            // checks whether the enumeration has elements


            // returns next element of the enumeration if the enumeration object has element to provide
            System.out.print(e.nextElement() +"   ");
        }
    }
}
