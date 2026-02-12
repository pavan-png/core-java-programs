public class PrimitiveValue_Injection {

    public static void main(String[] args) {

        // External primitive values
        String name = "Pavan";
        int age = 24;
        int id = 123;

        // Injecting primitive values into Student object
        Student01 student = new Student01(name, age, id);

        System.out.println(student);
    }
}
