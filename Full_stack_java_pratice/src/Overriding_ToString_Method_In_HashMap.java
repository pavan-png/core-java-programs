import java.util.*;

class Student_07{
    private String name;
    private Integer marks;
    private String city;

    public Student_07(String name, Integer marks, String city) {
        this.name = name;
        this.marks = marks;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public Integer getMarks() {
        return marks;
    }

    public String getCity() {
        return city;
    }

    /*
    overriding toString() method , if this method is not overridden manually it will give the hashcode/ address
     */
    public String toString(){
        return getName() +"   "+  getMarks() + "   " + getCity();
        /* getName() , getMarks() , getCity() they might return any type but
        even if any one of the method returns String then rest all of the method return types
        are treated as String.
        even "  " is also considered as String
        so no type error

         */
    }
}
public class Overriding_ToString_Method_In_HashMap {
    public static void main(String[] args) {
        Student_07 s = new Student_07("pavan",95,"vijayawada");
        Student_07 s1 = new Student_07("charan",80,"vijayawada");
        Student_07 s2 = new Student_07("Anand",80,"vijayawada");

        HashMap hm = new HashMap();
        hm.put(1,s);
        hm.put(2,s1);
        hm.put(3,s2);
        System.out.println("HashMap");
        System.out.println(hm);

        /*
        Hashmap does not support iterator to access the key-value data. so values() is used retrieve values in the HahMap
        values() method return type is  collection. values are added to the collection and using iterator()
        they are accessed.
         */
        System.out.println();
        System.out.println("using values() method to access values");
        Collection c = hm.values();
        Iterator it = c.iterator();
        while (it.hasNext() == true) {
            /* next() method returns the data type of element it returns.
            since value is of object type s ,s1,s2 casting is done
             */
            Object q = (Object)it.next();
            System.out.println(q+ "   ");
        }

        System.out.println();
        System.out.println();
        System.out.println("using keySet() method to access keys ");
        Set u = hm.keySet();
        Iterator it1 = u.iterator();
        while (it1.hasNext() == true) {
            Integer i = (Integer) it1.next();
             /* next() method returns the data type of element it returns.
            since key is  of number type casting is done
             */
            System.out.print(i + "   ");
        }
        System.out.println();
        System.out.println();

        System.out.println();
        System.out.println("using entrySet() method to access values in the HashMap");
        Set r = hm.entrySet();

        Iterator it2 = r.iterator();
        while (it2.hasNext() == true){
            /*
            when System.out.println() method is executed , it calls toString() method automatically, but we have
            overridden that method. the overridden toString() method returns the name , marks , city.
             */


            Map.Entry data = (Map.Entry) it2.next();
              /*
            data is of Entry type
            getKey() , getValue() are Entry interface methods , to access key and value methods.
            */

            System.out.println(data.getKey()+ " : " + data.getValue());
        }

    }
}
