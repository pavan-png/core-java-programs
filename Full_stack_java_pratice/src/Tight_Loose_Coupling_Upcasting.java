class Parent00 {
    // Base method that will be overridden in child classes (runtime polymorphism).
    void disp() {
        System.out.println("parent is displaying");
    }

    // Overloaded method: same name, different parameters (compile-time polymorphism).
    void disp(int count) {
        System.out.println("parent is displaying " + count + " time(s)");
    }
}

class Child01 extends Parent00 {
    // Overriding the base method -> resolved at runtime based on actual object type.
    void disp() {
        System.out.println("Child01 is displaying");
    }
}

class Child11 extends Parent00 {
    // Overriding the base method -> resolved at runtime based on actual object type.
    void disp() {
        System.out.println("Child11 is displaying ");
    }
}

public class Tight_Loose_Coupling_Upcasting {
    public static void main(String[] args) {
        // Tight coupling: this code is tied to one specific class.
        // Any change in that class can break or affect this code.
        // Because we use the actual class type, replacing it with another one is not easy. (Example: Child01 obj = new Child01();)

        Child01 obj = new Child01();
        obj.disp();

        // Loose coupling: this class depends on an interface, not a specific class.
        // Implementations can be changed without modifying this code.
        // Makes the code flexible and easy to maintain.
        Parent00 obj1 = new Child11(); // Upcasting: child object referenced by parent type.
        obj1.disp();

        Child11 obj2 = new Child11();
        obj2.disp();

        System.out.println("----------------------------------------------------------------------");
        Parent00 ref;
        ref = obj; // Upcasting: Child01 -> Parent00
        ref.disp(); // runtime polymorphism (overriding) chooses Child01 at runtime
        ref = obj2; // Upcasting: Child11 -> Parent00
        ref.disp(); // runtime polymorphism (overriding) chooses Child11 at runtime

        System.out.println("----------------------------------------------------------------------");
        // Compile-time polymorphism (method overloading): chosen by compiler using arguments.
        ref.disp(2);
        // Downcasting is not used in this example.
    }
}
