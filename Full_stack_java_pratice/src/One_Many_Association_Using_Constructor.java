import java.util.ArrayList;
import java.util.List;

public class One_Many_Association_Using_Constructor {

    public static void main(String[] args) {

        Employee_02 e1 = new Employee_02("pavan", "T123", "956-2/A");
        Employee_02 e2 = new Employee_02("charan", "I123", "23/456");
        Employee_02 e3 = new Employee_02("anand", "W789", "90/345");

        List<Employee_02> emps = new ArrayList<>();
        emps.add(e1);
        emps.add(e2);
        emps.add(e3);

        Department department =
                new Department(123, "Developer", emps);

        department.displayDepartmentDetails();
    }
}
