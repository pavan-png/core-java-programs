 class Student_02 {
    private String student_Name;
    private String student_Id;
    private String student_Address;
   private Branch_01 branch_01;

    public Student_02(String student_Name , String student_Id, String student_Address, Branch_01 branch_01){
        this.student_Name = student_Name;
        this.student_Id = student_Id;
        this.student_Address = student_Address;
        this.branch_01 = branch_01;
    }

     public String getStudent_Name() {
         return student_Name;
     }

     public String getStudent_Id() {
         return student_Id;
     }

     public String getStudent_Address() {
         return student_Address;
     }

     public Branch_01 getBranch_01() {
         return branch_01;
     }

     public void getStudentdetails(){
        System.out.println("========================the student details are===================================");
        System.out.println("the student name is "+getStudent_Name());
        System.out.println("the student is is "+getStudent_Id());
        System.out.println("the student address is "+getStudent_Address());
        System.out.println("the branch details are "+getBranch_01().getBranch_Name());
        System.out.println("the branch id is "+getBranch_01().getBranch_Id());

    }


}
