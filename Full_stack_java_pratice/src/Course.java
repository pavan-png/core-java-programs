public class Course {
   private  String course_Name;
    private String course_Id;
    private String course_Cost;
    public Course(String course_Name, String course_Id, String course_Cost){
        this.course_Name = course_Name;
        this.course_Id = course_Id;
        this.course_Cost = course_Cost;

    }
    public String getCourse_Name(){
        return course_Name;
    }

    public String getCourse_Id() {
        return course_Id;
    }
    public String getCourse_Cost(){
        return course_Cost;
    }

}
