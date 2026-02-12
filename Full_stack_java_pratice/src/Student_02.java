class Student_02 {

    private String student_Name;
    private String student_Id;
    private String student_Address;

    // MANY → ONE
    private Branch_01 branch_01;

    // Constructor Injection
    public Student_02(String student_Name,
                      String student_Id,
                      String student_Address,
                      Branch_01 branch_01) {

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

    // Improved display method
    public void getStudentdetails() {

        System.out.println("========== Student Details ==========");
        System.out.println("Student Name    : " + student_Name);
        System.out.println("Student Id      : " + student_Id);
        System.out.println("Student Address : " + student_Address);
        System.out.println("Branch Name     : " + branch_01.getBranch_Name());
        System.out.println("Branch Id       : " + branch_01.getBranch_Id());
        System.out.println("------------------------------------");
    }
}
