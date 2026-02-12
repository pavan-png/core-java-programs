class Outer {

    // 🔹 Private instance variable
    private int x = 10;

    // 🔹 Private method
    private void outerMethod() {
        System.out.println("Private method of Outer class");
    }

    // 🔹 Member Inner Class (Non-static)
    public class Inner {

        void display() {

            // Accessing private variable of outer class
            System.out.println("Accessing private variable x = " + x);

            // Calling private method of outer class
            outerMethod();
        }

        // ❌ Not allowed in non-static inner class
        // static void test() { }
    }

    // 🔹 Static Nested Class
    static class StaticNested {

        // Instance method
        void show() {
            System.out.println("Inside Static Nested Class (instance method)");
        }

        // ✅ Static method allowed
        static void staticShow() {
            System.out.println("Inside Static Nested Class (static method)");
        }
    }

    // 🔹 Outer class creating inner class object
    void createInnerObject() {
        Inner in = new Inner();
        in.display();
    }
}

public class Java_Member_Inner_Class {

    public static void main(String[] args) {

        // 🔹 Creating outer class object
        Outer outerObj = new Outer();

        // 🔹 Creating member inner class object
        Outer.Inner innerObj = outerObj.new Inner();
        innerObj.display();

        System.out.println("----------------");

        // 🔹 Outer class method creating inner object
        outerObj.createInnerObject();

        System.out.println("----------------");

        // 🔹 Creating static nested class object (instance method call)
        Outer.StaticNested staticObj = new Outer.StaticNested();
        staticObj.show();

        System.out.println("----------------");

        // 🔹 Calling static method of static nested class
        Outer.StaticNested.staticShow();
    }
}
