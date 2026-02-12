public class Student_03 {

    private String student_Name;
    private String student_Id;
    private String student_Address;
    private Course[] courses;   // Many-to-Many (this side)

    public Student_03(String student_Name,
                      String student_Id,
                      String student_Address,
                      Course[] courses) {

        this.student_Name = student_Name;
        this.student_Id = student_Id;
        this.student_Address = student_Address;
        this.courses = courses;
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

    public Course[] getCourses() {
        return courses;
    }

    public void get_Details() {

        System.out.println("Student Name : " + student_Name);
        System.out.println("Student Id   : " + student_Id);
        System.out.println("Student Addr : " + student_Address);

        System.out.println("---- Enrolled Courses ----");
        for (Course c : courses) {
            System.out.println(c.getCourse_Name() +
                    " | " + c.getCourse_Id() +
                    " | " + c.getCourse_Cost());
        }
        System.out.println("======================================");
    }
}
