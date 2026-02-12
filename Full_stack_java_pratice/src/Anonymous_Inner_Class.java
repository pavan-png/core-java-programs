// 🔹 Normal Parent Class
class Parent_1 {
    void show() {
        System.out.println("Parent show method");
    }
}

// 🔹 Interface
interface MyInterface {
    void display();
}

// 🔹 Outer Class with Inner Class
class Outer_3 {

    class Inner {
        void innerMethod() {
            System.out.println("Original Inner method");
        }
    }
}

public class Anonymous_Inner_Class{

    public static void main(String[] args) {

        System.out.println("---- 1️⃣ Extending a Normal Class ----");

        // 🔹 Anonymous class extending Parent class
        Parent_1 obj1 = new Parent_1() {

            // Overriding method of Parent
            void show() {
                System.out.println("Anonymous class overriding Parent method");
            }
        };

        // Calling overridden method
        obj1.show();


        System.out.println("\n---- 2️⃣ Implementing an Interface ----");

        // 🔹 Anonymous class implementing MyInterface
        MyInterface obj2 = new MyInterface() {

            // Providing implementation for interface method
            public void display() {
                System.out.println("Anonymous class implementing interface method");
            }
        };

        obj2.display();


        System.out.println("\n---- 3️⃣ Extending an Inner Class ----");

        // Creating outer object (required for non-static inner class)
        Outer_3 outer = new Outer_3();

        // 🔹 Anonymous class extending Inner class
        Outer_3.Inner obj3 = outer.new Inner() {

            // Overriding inner class method
            void innerMethod() {
                System.out.println("Anonymous class overriding Inner class method");
            }
        };

        obj3.innerMethod();
    }
}
