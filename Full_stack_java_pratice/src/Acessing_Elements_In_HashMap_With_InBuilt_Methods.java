import java.util.*;

public class Acessing_Elements_In_HashMap_With_InBuilt_Methods {
    public static void main(String[] args) {
        HashMap hm1 = new HashMap();
        hm1.put(1, "palace");
        hm1.put(2, "bungalow");
        hm1.put(3, "villa");
        hm1.put(4, "duplex");
        System.out.println(hm1);
        /*
        Hashmap does not support iterator to access the key-value data. so values() is used retrieve values in the HahMap
        values() method return type is  collection. values are added to the collection and using iterator()
        they are accessed.
         */
        System.out.println();
        System.out.println("using values() method to access values");
        Collection c = hm1.values();
        Iterator it = c.iterator();
        while (it.hasNext() == true) {
            /* next() method returns the data type of element it returns.
            since value is a String type casting is done
             */
            String s = (String) it.next();
            System.out.print(s + "   ");
        }
    /*
        Hashmap does not support iterator to access the key-value data. so keySet() is used retrieve keys in the HahMap
        keySet() method return type is Set. keys are added to the set and using iterator()
        they are accessed.
    */
        System.out.println();
        System.out.println();
        System.out.println("using keySet() method to access keys ");
        Set s = hm1.keySet();
        Iterator it1 = s.iterator();
        while (it1.hasNext() == true) {
            Integer i = (Integer) it1.next();
             /* next() method returns the data type of element it returns.
            since key is  of number type casting is done
             */
            System.out.print(i + "   ");
        }
        System.out.println();
        System.out.println();
        System.out.println("using entrySet() method to access both keys and values ");
        /*
        Hashmap does not support iterator to access the key-value data. so entrySet() is used retrieve key-values in the HahMap
        entrySet() method return type is Set. key-value are added to the set and using iterator()
        they are accessed.
    */
        Set s1 = hm1.entrySet();
        Iterator it2 = s1.iterator();
        while (it2.hasNext()) {
            /* next() method returns the data type of element it returns.
            key - value is called as an entry , Entry is a nested interface of the Map interface.
             */
            Map.Entry data = (Map.Entry) it2.next();
            /*
            data is of Entry type
            getKey() , getValue() are Entry interface methods , to access key and value methods.
            */
            System.out.println(data.getKey() + " :  " + data.getValue());
        }
    }
}