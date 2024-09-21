import java.util.*;

public class Acessing_Elements_In_LinkedHashMap_With_InBuilt_Methods {
    public static void main(String[] args) {
        LinkedHashMap lhm = new LinkedHashMap();
        lhm.put(1,"pavan");
        lhm.put(2,"bought");
        lhm.put(3,"a");
        lhm.put(4,"commercial");
        lhm.put(5,"complex");
        lhm.put(6,"at");
        lhm.put(7,"amaravathi");
        System.out.println(lhm);
/*
        LinkedHashmap does not support iterator to access the key-value data. so values() is used retrieve values in the LinkedHashMap
        values() method return type is  collection. values are added to the collection and using iterator()
        they are accessed.
         */
        System.out.println();
        System.out.println("using values() method to access values");
        Collection c =lhm.values();
        Iterator it = c.iterator();
        while (it.hasNext() == true){
            String s = (String)it.next();
             /* next() method returns the data type of element it returns.
            since value is a String it casting is done
             */
            System.out.print( s + "   ");
        }
         /*
        LinkedHashmap does not support iterator to access the key-value data. so keySet() is used retrieve keys in the LinkedHahMap
        keySet() method return type is Set. keys are added to the set and using iterator()
        they are accessed.
    */
        System.out.println();
        System.out.println();
        System.out.println("using keySet() method to access keys ");
        Set s = lhm.keySet();
        Iterator it1 = s.iterator();
        while (it1.hasNext()==true){
            Integer i = (Integer)it1.next();
             /* next() method returns the data type of element it returns.
            since key is  of number type casting is done
             */
            System.out.print(i+ "   ");
        }
        System.out.println();
        System.out.println();
        System.out.println("using entrySet() method to access both keys and values ");
        /*
        LinkedHashmap does not support iterator to access the key-value data. so entrySet() is used retrieve key-values in the LinkedHashMap
        entrySet() method return type is Set. key-value are added to the set and using iterator()
        they are accessed.
    */
        Set s1 = lhm.entrySet();
        Iterator it2 = s1.iterator();
        while (it2.hasNext()){
            Map.Entry data = (Map.Entry) it2.next();
             /* next() method returns the data type of element it returns.
            key - value is called as an entry , Entry is a nested interface of the Map interface.
             */
            System.out.print(data + "   ");
        }
    }
}
