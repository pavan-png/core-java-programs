class collage {
private String student_name ;
private int  Student_id;
private  String branch ;
public collage(String student_name, int Student_id , String branch){
    this.student_name = student_name;
    this.Student_id = Student_id;
    this.branch = branch;
}

    public String getStudent_name() {
        return student_name;
    }
    public int getStudent_id(){
    return Student_id;
    }
    public  String getBranch(){
    return branch;
    }
}
public class Constructor {
    public static void main(String[] args) {


        collage obj = new collage("pavan", 12345, "Ai");
        System.out.println(obj.getStudent_name());
        System.out.println(obj.getStudent_id());
        System.out.println(obj.getBranch());
    }
}
