public class One_Many_Association_Using_Setter_Getter {
    public static void main(String[] args) {
        Employee_03 emp_01 = new Employee_03();
        emp_01.setEmp_Name("pavan");
        emp_01.setEmp_Id("#234");
        emp_01.setEmp_Address("456-A");


        Employee_03 emp_02 = new Employee_03();
        emp_02.setEmp_Name("charan");
        emp_02.setEmp_Id("#897");
        emp_02.setEmp_Address("879-A");


        Employee_03 emp_03 = new Employee_03();
        emp_03.setEmp_Name("Anand");
        emp_03.setEmp_Id("#789");
        emp_03.setEmp_Address("875-Z");



        Department_1 department_1 = new Department_1();
        department_1.setDepartment_Id(128 );
        department_1.setDepartment_Name("IT");
        // Here we are injecting multiple employees to department through setter
        department_1.setEmployee_03(emp_01);

        System.out.println("The department id is : "+department_1.getDepartment_Id());
        System.out.println("The department name is : "+department_1.getDepartment_Name());
        System.out.println("-----the employee details are --------------------");
        System.out.println("the employee name is " +department_1.getEmployee_03().getEmp_Name());
        System.out.println("the employee id is "+department_1.getEmployee_03().getEmp_Id());
        System.out.println("the employee address is  "+department_1.getEmployee_03().getEmp_Address());
        System.out.println();
        department_1.setEmployee_03(emp_02);
        System.out.println("the employee name is " +department_1.getEmployee_03().getEmp_Name());
        System.out.println("the employee id is "+department_1.getEmployee_03().getEmp_Id());
        System.out.println("the employee address is  "+department_1.getEmployee_03().getEmp_Address());
        System.out.println();
        department_1.setEmployee_03(emp_03);
        System.out.println("the employee name is " +department_1.getEmployee_03().getEmp_Name());
        System.out.println("the employee id is "+department_1.getEmployee_03().getEmp_Id());
        System.out.println("the employee address is  "+department_1.getEmployee_03().getEmp_Address());




    }
}
