public class Student_04 {

    private String student_Name;
    private String student_Id;
    private String student_Address;

    // MANY-TO-MANY (this side)
    private Course_01[] courses;

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

    public void setCourses(Course_01[] courses) {
        this.courses = courses;
    }

    public Course_01[] getCourses() {
        return courses;
    }
}
