public class One_One_Association_Using_Setters_Getters {
    public static void main(String[] args) {
        Account_011 account_011 = new Account_011();
        account_011.setAcc_No(123456);
        account_011.setAcc_Holder_Name("pavan");
        account_011.setAcc_Type("savings bank");
        Employee_011 employee_011 = new Employee_011();
        employee_011.setEmp_Name("pavan");
        employee_011.setEmp_Id(8796);
        employee_011.setEmp_Address("vijayawada");
        employee_011.setAccount_011(account_011);

        System.out.println("the employee  name is  "+employee_011.getEmp_Name());
        System.out.println("the employee id is " + employee_011.getEmp_Id());
        System.out.println("the employee address is "+employee_011.getEmp_Address());
        System.out.println("================= Bank details ========================");
        System.out.println("the account no is "+employee_011.getAccount_011().getAcc_No());
        System.out.println("the holder name is "+employee_011.getAccount_011().getAcc_Holder_Name());
        System.out.println("the account type is "+employee_011.getAccount_011().getAcc_Type());




    }
}