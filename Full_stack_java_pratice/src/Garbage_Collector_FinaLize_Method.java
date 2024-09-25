class Employee_12{
    private int emp_Id;
    private String emp_Name;
    private String emp_Address;

    public Employee_12(int emp_Id, String emp_Name, String emp_Address) {
        this.emp_Id = emp_Id;
        this.emp_Name = emp_Name;
        this.emp_Address = emp_Address;
    }

    public int getEmp_Id() {
        return emp_Id;
    }

    public String getEmp_Name() {
        return emp_Name;
    }

    public String getEmp_Address() {
        return emp_Address;
    }

    @Override
    // by  default garbage collects calls the finalize method. it contains the code for garbage collector
    public void finalize()  {
        System.out.println("garbage collector collected the object");
    }
}
public class Garbage_Collector_FinaLize_Method {
    public static void main(String[] args) {
        Employee_12 e = new Employee_12(123 , "pavan","vijayawada");

        e = null; // elligible for garbage collection

        // calling garbage collector explicitly
        System.gc();



    }
}
