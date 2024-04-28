public class Student_03 {
   private String student_Name;
    private String student_Id;
    private String student_Address;

    private Course[] courses;
    public  Student_03(String student_Name, String student_Id, String student_Address, Course[] courses){
        this.student_Name = student_Name;
        this.student_Id = student_Id;
        this.student_Address = student_Address;
        this.courses = courses;
    }

    public String getStudent_Name() {
        return student_Name;
    }

    public  String getStudent_Id(){
        return student_Id;
    }

    public String getStudent_Address(){
        return student_Address;
    }

    public void get_Details(){
        System.out.println("the student name is "+getStudent_Name());
        System.out.println("the student id is "+getStudent_Id());
        System.out.println("the student address is "+getStudent_Address());
        System.out.println("========the course details are==========");
        for (Course c : courses ){
            System.out.println("the course name is "+c.getCourse_Name());
            System.out.println("the course id is "+c.getCourse_Id());
            System.out.println("the course price "+c.getCourse_Cost());
        }
        System.out.println("==================================================================================");
    }

}
