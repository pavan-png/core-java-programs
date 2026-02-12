public class Course {

    private String course_Name;
    private String course_Id;
    private String course_Cost;
    private Student_03[] students;   // Many-to-Many (other side)

    public Course(String course_Name,
                  String course_Id,
                  String course_Cost,
                  Student_03[] students) {

        this.course_Name = course_Name;
        this.course_Id = course_Id;
        this.course_Cost = course_Cost;
        this.students = students;
    }

    public String getCourse_Name() {
        return course_Name;
    }

    public String getCourse_Id() {
        return course_Id;
    }

    public String getCourse_Cost() {
        return course_Cost;
    }

    public Student_03[] getStudents() {
        return students;
    }
}
