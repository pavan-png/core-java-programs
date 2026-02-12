class Student_01 {

    private String student_Name;
    private String student_Id;
    private String student_Address;

    // MANY → ONE
    private Branch branch;

    public void setStudent_Name(String student_Name) {
        this.student_Name = student_Name;
    }

    public String getStudent_Name() {
        return student_Name;
    }

    public void setStudent_Id(String student_Id) {
        this.student_Id = student_Id;
    }

    public String getStudent_Id() {
        return student_Id;
    }

    public void setStudent_Address(String student_Address) {
        this.student_Address = student_Address;
    }

    public String getStudent_Address() {
        return student_Address;
    }

    // Setter Injection
    public void setBranch(Branch branch) {
        this.branch = branch;
    }

    public Branch getBranch() {
        return branch;
    }

    // ✅ Improvement: display logic inside class
    public void displayStudentDetails() {
        System.out.println("Student Name   : " + student_Name);
        System.out.println("Student Id     : " + student_Id);
        System.out.println("Student Address: " + student_Address);

        if (branch != null) {
            System.out.println("Branch Name    : " + branch.getBranch_Name());
            System.out.println("Branch Id      : " + branch.getBraanch_Id());
        }
        System.out.println("------------------------------------------------");
    }
}
