public class One_Many_Association_Using_Constructor {
    public static void main(String[] args) {
        Employee_02 employee_02 = new Employee_02("pavan","T123","956-2/A");
        Employee_02 employee_021 = new Employee_02("charan","I123","23/456");
        Employee_02 employee_022 = new Employee_02("anand","W789","90/345");
           Employee_02[] emps1 = new Employee_02[3];
           emps1[0] = employee_02;
           emps1[1] = employee_021;
           emps1[2] = employee_022;
        Department department = new Department(123,"Developer",emps1);
        department.getDepartment_Details();
    }
}
