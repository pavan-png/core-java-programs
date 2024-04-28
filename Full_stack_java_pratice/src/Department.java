 class Department {
 private Integer department_Id;
 private String department_Name;
 private Employee_02[] employee_02;

 public Department(Integer department_Id , String department_Name, Employee_02[] employee_02){
     this.department_Id = department_Id;
     this.department_Name = department_Name;
     this.employee_02 = employee_02;

 }

 public void getDepartment_Details(){
     System.out.println("The department id is : "+department_Id);
     System.out.println("The department name is : "+department_Name);
     System.out.println("==================the employee details are======================");
     for (Employee_02  ref : employee_02){
         System.out.println("the employee name is : "+ref.getEmp_Name());
         System.out.println("the employee id is : "+ref.getEmp_Id());
         System.out.println("the employee address is : "+ref.getEmp_Address());
         System.out.println();
     }

 }




}
