class Employee_011 {

    private String emp_Name;
    private Integer emp_Id;
    private String emp_Address;
    private Account_011 account_011;   // One-to-One Association

    public void setEmp_Name(String emp_Name) {
        this.emp_Name = emp_Name;
    }

    public String getEmp_Name() {
        return emp_Name;
    }

    public void setEmp_Id(Integer emp_Id) {
        this.emp_Id = emp_Id;
    }

    public Integer getEmp_Id() {
        return emp_Id;
    }

    public void setEmp_Address(String emp_Address) {
        this.emp_Address = emp_Address;
    }

    public String getEmp_Address() {
        return emp_Address;
    }

    // Setter Injection
    public void setAccount_011(Account_011 account_011) {
        this.account_011 = account_011;
    }

    public Account_011 getAccount_011() {
        return account_011;
    }

    // ✅ Improvement: business logic inside class
    public void displayEmployeeDetails() {

        System.out.println("Employee Name    : " + emp_Name);
        System.out.println("Employee ID      : " + emp_Id);
        System.out.println("Employee Address : " + emp_Address);

        if (account_011 != null) {
            System.out.println("=========== Bank Details ===========");
            System.out.println("Account No       : " + account_011.getAcc_No());
            System.out.println("Holder Name      : " + account_011.getAcc_Holder_Name());
            System.out.println("Account Type     : " + account_011.getAcc_Type());
        } else {
            System.out.println("No account is associated with this employee.");
        }
    }
}
