import java.util.ArrayList;
import java.util.List;

class Department_1 {

    private Integer department_Id;
    private String department_Name;

    // ✅ One-to-Many Association
    private List<Employee_03> employees = new ArrayList<>();

    public void setDepartment_Id(Integer department_Id) {
        this.department_Id = department_Id;
    }

    public Integer getDepartment_Id() {
        return department_Id;
    }

    public void setDepartment_Name(String department_Name) {
        this.department_Name = department_Name;
    }

    public String getDepartment_Name() {
        return department_Name;
    }

    // ✅ Setter Injection (adding one employee at a time)
    public void setEmployee_03(Employee_03 employee_03) {
        this.employees.add(employee_03);
    }

    public List<Employee_03> getEmployee_03() {
        return employees;
    }

    // Helper method for display
    public void displayDepartmentDetails() {

        System.out.println("The department id is : " + department_Id);
        System.out.println("The department name is : " + department_Name);
        System.out.println("----- the employee details are -----");

        for (Employee_03 emp : employees) {
            System.out.println("Employee name    : " + emp.getEmp_Name());
            System.out.println("Employee id      : " + emp.getEmp_Id());
            System.out.println("Employee address : " + emp.getEmp_Address());
            System.out.println();
        }
    }
}
