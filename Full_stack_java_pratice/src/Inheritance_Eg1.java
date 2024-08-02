  class Person{
    String name = "no name";
    public  Person(String nm ){
        name = nm;
    }
} class Employee_89 extends Person{
String emp_Id = "000";
 public  Employee_89(String id)
{
 super("pavan");
    emp_Id = id;
}



}

public class Inheritance_Eg1 {
    public static void main(String[] args) {
        Employee_89 obj = new Employee_89("4321");
        System.out.println(obj.emp_Id);
    }
}
