class Employee01 {

    private String empName;
    private Integer empId;
    private String empAddress;
    private Account01 account01;   // One-to-One Association

    public Employee01(String empName, Integer empId, String empAddress, Account01 account01) {
        this.empName = empName;
        this.empId = empId;
        this.empAddress = empAddress;
        this.account01 = account01;
    }

    public void getEmployeeDetails() {
        System.out.println("Employee Name  : " + empName);
        System.out.println("Employee ID    : " + empId);
        System.out.println("Employee Addr  : " + empAddress);

        if (account01 != null) {
            System.out.println("========== Account Details ==========");
            System.out.println("Account No     : " + account01.getAccNo());
            System.out.println("Holder Name    : " + account01.getAccHolderName());
            System.out.println("Account Type   : " + account01.getAccType());
        } else {
            System.out.println("No Account Associated");
        }
    }
}
