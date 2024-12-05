class Student1{
    private String name ;
    private int age;
    private String city ;

    /* if you want you can write some extra logic to getter and setter , to restrict the user to give only specific input
      */
    void setName(String name){

        this.name = name;
    }
    String getName(){

        return name;
    }

    void setAge(int age){

        this.age = age;
    }
    int getAge() {

        return age;
    }
    void setCity(String city){

        this.city = city;
    }
    String getCity(){

        return city;
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        Student1 obj = new Student1();
        obj.setName("pavan");
        String name = obj.getName();
        System.out.println(name);
        obj.setAge(25);
        System.out.println(obj.getAge());
        obj.setCity("vijayawada");
        System.out.println(obj.getCity());

    }
}
