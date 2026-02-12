import java.util.List;

class Department {

    private Integer department_Id;
    private String department_Name;
    private List<Employee_02> employee_02;   // One-to-Many Association

    // Constructor Injection
    public Department(Integer department_Id, String department_Name,
                      List<Employee_02> employee_02) {

        this.department_Id = department_Id;
        this.department_Name = department_Name;
        this.employee_02 = employee_02;
    }

    public void displayDepartmentDetails() {

        System.out.println("Department ID   : " + department_Id);
        System.out.println("Department Name : " + department_Name);
        System.out.println("========== Employee Details ==========");

        if (employee_02 != null && !employee_02.isEmpty()) {
            for (Employee_02 ref : employee_02) {
                System.out.println("Employee Name    : " + ref.getEmp_Name());
                System.out.println("Employee ID      : " + ref.getEmp_Id());
                System.out.println("Employee Address : " + ref.getEmp_Address());
                System.out.println();
            }
        } else {
            System.out.println("No employees in this department.");
        }
    }
}
