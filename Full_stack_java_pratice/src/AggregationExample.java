// Employee class
class Employee {
    private String name;
    private int id;

    // Constructor
    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    // Method to display employee information
    public void displayEmployeeInfo() {
        System.out.println("Employee ID: " + id + ", Name: " + name);
    }
}

// Department class
class Department_2 {
    private String departmentName;
    private Employee[] employees; // Array of Employee objects

    // Constructor
    public Department_2(String departmentName, Employee[] employees) {
        this.departmentName = departmentName;
        this.employees = employees;
    }

    // Method to display department information along with employee details
    public void displayDepartmentInfo() {
        System.out.println("Department: " + departmentName);
        System.out.println("Employees in " + departmentName + ":");
        for (Employee employee : employees) {
            employee.displayEmployeeInfo();
        }
    }
}

public class AggregationExample {
    public static void main(String[] args) {
        // Creating Employee objects
        Employee emp1 = new Employee("John Doe", 101);
        Employee emp2 = new Employee("Jane Smith", 102);

        // Array of Employee objects
        Employee[] employees = { emp1, emp2 };

        // Creating Department object
        Department_2 department = new Department_2("IT Department", employees);

        // Displaying Department and Employee info
        department.displayDepartmentInfo();
    }
}
