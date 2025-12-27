// Class demonstrating instance variables and this keyword
public class Instance_Variable_This_Keyword_3 {

    // Instance variables (stored inside object in heap)
    String name;
    int age;

    // Constructor with parameters
    // Used to initialize instance variables
    Instance_Variable_This_Keyword_3(String name, int age) {

        // 'this.name' refers to instance variable
        // 'name' refers to constructor parameter (local variable)
        this.name = name;

        // 'this.age' refers to instance variable
        // 'age' refers to constructor parameter (local variable)
        this.age = age;
    }

    // Instance method
    void test() {

        //  'this' holds the reference of the currently executing object
        // Here, 'this.name' and 'name' both point to the same instance variable
        // because no local variable named 'name' exists in this method
        System.out.println("the name is " + this.name);
    }

    public static void main(String[] args) {

        // Object creation
        // Memory is allocated in heap and constructor is called
        Instance_Variable_This_Keyword_3 std =
                new Instance_Variable_This_Keyword_3("pavan", 24);

        // Accessing instance variable using reference variable
        System.out.println(std.age);

        // Calling instance method using reference variable
        std.test();
    }
}
