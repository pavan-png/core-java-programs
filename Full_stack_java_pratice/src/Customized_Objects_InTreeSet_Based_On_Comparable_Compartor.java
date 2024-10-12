import java.util.Comparator;
import java.util.TreeSet;



class Employee_15 implements Comparable{
    Integer id;
    String name;
    public Employee_15(Integer id , String name){
        this.id = id;
        this.name = name;
    }

    // overriding toString() to get the data instead of hashcode
    public String toString(){
        return id + "--->" +name;
    }

    @Override
    public int compareTo(Object o) {
        /*
         e2 is passed as parameter to compareTo() method.
        but e1 is a local variable in the main() method we cant access it.
        jvm internally uses the reference of the object we are using that by using this keyword .
         */
        Integer id1 = this.id;
        Employee_15 e = (Employee_15)o;
        Integer id2 = e.id;
        if (id1>id2){
            return +1;
        } else if (id1<id2) {
            return -1;
        }
        else
            return 0;
    }
}
public class Customized_Objects_InTreeSet_Based_On_Comparable_Compartor {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet();
        Employee_15 e1 = new Employee_15(123,"pavan");
        Employee_15 e2 = new Employee_15(124,"Anand");
        Employee_15 e3 = new Employee_15(125,"charan");
        Employee_15 e4 = new Employee_15(126,"tarun");

        ts.add(e1);  // e1.compareTo(e2) internally
        ts.add(e2);
        ts.add(e3);
        ts.add(e4);
        System.out.println("Custom defined Comparable");
        System.out.println(ts);
        System.out.println();
        System.out.println("--------------------------------------");

        TreeSet ts1 = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Employee_15 obj = (Employee_15) o1;
                String n1 = obj.name;
                Employee_15 obj1 = (Employee_15) o2;
                String n2 = obj1.name;
                return n1.compareTo(n2);
            }
        });
        Employee_15 e11 = new Employee_15(123,"pavan");
        Employee_15 e12 = new Employee_15(124,"Anand");
        Employee_15 e13 = new Employee_15(125,"charan");
        Employee_15 e14 = new Employee_15(126,"tarun");

        ts1.add(e11);
        ts1.add(e12); // compare( e11 , e12 )  internally
        ts1.add(e13);
        ts1.add(e14);
        System.out.println("custom defined comparator");
        System.out.println(ts1);



    }
}
