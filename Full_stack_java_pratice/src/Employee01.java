 class Employee01 {
    private  String emp_Name;
    private  Integer emp_Id;
    private  String  emp_Address;

   private  Account01 account01;

    public Employee01(String emp_Name , Integer emp_Id , String emp_Address , Account01 account01){
        this.emp_Name = emp_Name;
        this.emp_Id = emp_Id;
        this.emp_Address = emp_Address;
        this.account01 = account01;
    }

    public void get_Employee_details(){
        System.out.println("Employee name is : "+emp_Name);
        System.out.println("Employee id is : " +emp_Id);
        System.out.println("Employee Address is  : " +emp_Address);
        System.out.println("======================Account Details are======================"  );
        System.out.println("Account no is : " +account01.getAcc_No());
        System.out.println("Account holder name is : " +account01.getAcc_Holder_Name());
        System.out.println("Account type is : " +account01.getAcc_Type());
    }


}
