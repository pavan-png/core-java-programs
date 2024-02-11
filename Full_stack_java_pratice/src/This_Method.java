class Employee1{
private String Emp_name  = "pavan";
private  int Emp_id =  1234;
private String Emp_role = " java developer";
public Employee1(String Emp_name , int Emp_id , String Emp_role){
    this();
    this.Emp_name = Emp_name;
    this.Emp_id = Emp_id;
    this.Emp_role = Emp_role;
}

 public Employee1(){
    this( "kalyan");
    Emp_id = 456;
    Emp_role = " java full stack developer";

}
 public Employee1(String Emp_name ){
this.Emp_name = Emp_name;
}

    public String getEmp_name() {
        return Emp_name;
    }

    public int getEmp_id() {
        return Emp_id;
    }

    public String getEmp_role() {
        return Emp_role;
    }
}
public class This_Method {
    public static void main(String[] args) {
        Employee1 obj = new Employee1("mohan",987,"java framework specialist");
        System.out.println( obj.getEmp_name());
        System.out.println(obj.getEmp_id());
        System.out.println(obj.getEmp_role());

    }
}
