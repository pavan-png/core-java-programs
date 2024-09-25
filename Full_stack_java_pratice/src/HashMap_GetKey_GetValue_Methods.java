import java.security.Key;
import java.util.*;
class Student_10 {
    private String name;
    private Integer marks;
    private String city;

    public Student_10(String name, Integer marks, String city) {
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
    public class HashMap_GetKey_GetValue_Methods {
        public static void main(String[] args) {

            Student_10 s = new Student_10("pavan",95,"vijayawada");
            Student_10 s1 = new Student_10("charan",80,"vijayawada");
            Student_10 s2 = new Student_10("Anand",80,"vijayawada");

            HashMap hm = new HashMap();
            hm.put(111,s);
            hm.put(222,s1);
            hm.put(333,s2);
            System.out.println("HashMap");
            System.out.println(hm);  Scanner sc = new Scanner(System.in);
            System.out.println("enter the key to search ");
            Integer i = sc.nextInt();

            Boolean flag = false;

           Set a = hm.entrySet();
           Iterator ir = a.iterator();
           while (ir.hasNext()){
              Map.Entry details = (Map.Entry) ir.next();
                Integer u =(Integer) details.getKey();
              if (i==u){
                  System.out.println("the details are : "+details.getValue());
                  flag = true;
              }
           }
            if (flag == false){
                System.out.println("invalid entry , chusi kottara yedava");
            }
        }
    }

