import java.util.*;

class Employee_14{
    private int emp_Id;
    private String emp_Name;
    private String emp_Address;

    public Employee_14(int emp_Id, String emp_Name, String emp_Address) {
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

public class Garbage_Collector_Dominating_WeakHashMap {

    public static void main(String[] args) {
        Employee_14 e = new Employee_14(123 , "pavan","vijayawada");



        WeakHashMap whm = new WeakHashMap();
        whm.put(e,1);
        e = null; // eligible for garbage collection
         /*
        if object is inserted as value garbage collector will not collect that.
        if the object is inserted as key gc will collect it.
         */

        // calling garbage collector explicitly



        System.gc();

        System.out.println("execution completed");
    }
}

