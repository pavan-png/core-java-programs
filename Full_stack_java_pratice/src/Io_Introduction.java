class Student_1{
    private Integer id;
    private String name;
    private Integer age;

    public Student_1(Integer id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String toString(){
        return "id : " +id + "  " +" name : "+name+"  "+"age  :"+age;
    }
}
public class Io_Introduction {
    public static void main(String[] args) {
        Student_1 obj = new Student_1(12,"pavan",25);
        System.out.println(obj);

    }

}
