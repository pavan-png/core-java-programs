import java.util.HashMap;

class Employee_13{
    private int emp_Id;
    private String emp_Name;
    private String emp_Address;

    public Employee_13(int emp_Id, String emp_Name, String emp_Address) {
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
public class HashMap_Dominating_Garbage_Collector {
    public static void main(String[] args) {
        Employee_13 e = new Employee_13(123 , "pavan","vijayawada");

        HashMap hm = new HashMap();
        hm.put(1,e);
        e = null; // eligible for garbage collection
        // calling garbage collector explicitly


        System.gc();

        /*
        hashMap will dominate garbage collector . as object e is used by the HasMap it wont allow gc to clear the object
        */

        System.out.println("execution completed");
    }
}
