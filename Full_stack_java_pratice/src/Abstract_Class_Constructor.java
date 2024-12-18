abstract class Person_100{
    // even if the class doesn't contain any abstract methods we can make it abstract.
String name;
Integer age;
Float height;
Person_100(String name , Integer age , Float height){
    System.out.println("abstract class constructor");
    this.name = name;
    this.age = age;
    this.height = height;

}
}
class Student_101 extends Person_100{
 Integer sid;
 Float marks;
 String course_Name;

 Student_101(String name,Integer age, Float height, Integer sid, Float marks, String course_Name){
        super(name, age, height); // industry recommended.
        this.sid = sid;
        this.marks = marks;
        this.course_Name = course_Name;
 }
 void  get_Details(){

 }

}



public class Abstract_Class_Constructor {
    public static void main(String[] args) {
    Person_100 obj = new Student_101("pavan",24,5.75f,123,98.5f,"cse");
    }
}
