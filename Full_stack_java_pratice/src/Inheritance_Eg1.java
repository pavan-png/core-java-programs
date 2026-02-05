// 1. Define the Parent class 'Person'
class Person {
    String name = "no name";

    // 4. The Parent constructor is executed.
    public Person(String nm) {
        // 5. The 'name' variable is initialized with the value passed from the Child class ("pavan").
        name = nm;
    }
}

// 2. Define the Child class 'Employee_89' which extends 'Person'
class Employee_89 extends Person {
    String emp_Id = "000";

    // 3. The Child constructor is called when creating the object.
    public Employee_89(String id) {
        // 3a. 'super("pavan")' calls the Parent class constructor. 
        // This must be the first statement in the child constructor.
        super("pavan");
        
        // 6. After the Parent constructor completes, the Child class continues initialization.
        // The 'emp_Id' is assigned the value passed from main ("4321").
        emp_Id = id;
    }
}

public class Inheritance_Eg1 {
    public static void main(String[] args) {
        // Flow of Execution:
        // Step 1: The main method begins execution.
        // Step 2: A new 'Employee_89' object is created with the argument "4321".
        //         This triggers the constructor of 'Employee_89'.
        Employee_89 obj = new Employee_89("4321");
        
        // Step 7: The object is fully constructed. The 'emp_Id' is printed to the console.
        System.out.println(obj.emp_Id);
    }
}