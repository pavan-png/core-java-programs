public class One_One_Association_Using_Setters_Getters {

    public static void main(String[] args) {

        // Step 1: Create dependency object
        Account_011 account_011 = new Account_011();
        account_011.setAcc_No(123456);
        account_011.setAcc_Holder_Name("pavan");
        account_011.setAcc_Type("savings bank");

        // Step 2: Create target object
        Employee_011 employee_011 = new Employee_011();
        employee_011.setEmp_Name("pavan");
        employee_011.setEmp_Id(8796);
        employee_011.setEmp_Address("vijayawada");

        // Step 3: Inject dependency using setter
        employee_011.setAccount_011(account_011);

        // Step 4: Display details
        employee_011.displayEmployeeDetails();
    }
}
