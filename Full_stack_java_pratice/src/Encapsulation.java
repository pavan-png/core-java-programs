class Student1 {
    private String name;
    private int age;
    private String city;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if (age > 0) {          // controlled access
            this.age = age;
        }
    }

    public int getAge() {
        return age;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Student1 obj = new Student1();

        obj.setName("Pavan");
        System.out.println(obj.getName());

        obj.setAge(25);
        System.out.println(obj.getAge());

        obj.setCity("Vijayawada");
        System.out.println(obj.getCity());
    }
}
