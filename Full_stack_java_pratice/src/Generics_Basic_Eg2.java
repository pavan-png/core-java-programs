import java.util .*;
class Student_09{

    private Integer age;
    private Integer marks;
    private String name;

    public Student_09(int age, int marks, String name) {
        this.age = age;
        this.marks = marks;
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public int getMarks(){
        return marks;
    }

    public String getName () {
        return name;
    }
}

public class Generics_Basic_Eg2 {
    public static void main(String[] args) {
        Student_09 obj = new Student_09(25,95,"pavan");
        Student_09 obj1 = new Student_09(23,80,"charan");
        Student_09 obj2 = new Student_09(23,80,"anand");


        ArrayList <Student_09> al = new ArrayList<Student_09>();
        al.add(obj);
        al.add(obj1);
        al.add(obj2);
        System.out.println(al);


    }
}
