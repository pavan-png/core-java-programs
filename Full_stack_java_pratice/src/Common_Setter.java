class Student2 {
    private String name;
    private int age;
    private String city;

    public void setData(String name, int age, String city){
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }
}

public class Common_Setter {
    public static void main(String[] args) {
        Student2 obj = new Student2();
        obj.setData("pavan", 24, "vijayawada");

        System.out.println(obj.getName());
        System.out.println(obj.getAge());
        System.out.println(obj.getCity());
    }
}
