// Student is a normal user-defined class
class Student {

    // Instance variables
    String name = "pavan";
    int id = 1;

    // No toString() method is overridden here
}

public class String_Eg25 {
    public static void main(String[] args) {

        // Creating an object of Student class
        Student s = new Student();

        // When we print an object directly,
        // Java internally calls s.toString()
        // Since Student class does NOT override toString(),
        // Object class toString() method is used
        // Output format: classname@hexadecimalHashCode
        System.out.println(s);

        // Explicitly calling toString() on Student object
        // Same output as above because Object class toString() is called
        System.out.println(s.toString()); // Student@hexadecimal value

        System.out.println();

        // Creating a String literal
        String s1 = "Hello";

        // Printing String object
        // String class OVERRIDES toString()
        // So it returns the actual string content
        System.out.println(s1);

        // Explicitly calling toString() on String object
        // String's toString() returns the same string content
        System.out.println(s1.toString());
    }
}
