class Student {
    String name  = "pavan";
    int id  = 1;
}
public class String_Eg25 {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s);
        System.out.println(s.toString()); // gives student@hexadecimal value .
        System.out.println();

        String s1 = "Hello";
        System.out.println(s1);
        System.out.println(s1.toString());

    }
}
