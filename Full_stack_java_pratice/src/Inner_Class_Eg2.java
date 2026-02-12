// Outer class
class Shape {

    // 🔹 Constructor of Outer class
    public Shape() {
        System.out.println("Shape constructor");
    }

    // 🔹 Non-static Member Inner Class
    public class Color {

        // Constructor of Inner class
        public Color() {
            System.out.println("Color constructor");
        }
    }
}

public class Inner_Class_Eg2 {

    public static void main(String[] args) {

        /*
         ❌ Wrong way:
         Shape.Color obj = new Shape().Color();

         Why?
         Because without 'new' before Color(),
         compiler treats Color as a method call.
         Since there is no method named Color(),
         it gives compile-time error.
        */

        // ✅ Correct way (Single line)
        // Step 1: new Shape() → creates outer class object
        // Step 2: .new Color() → creates inner class object linked to that outer object
        Shape.Color obj1 = new Shape().new Color();

        System.out.println("--------------");

        // ✅ Creating outer object separately
        Shape obj2 = new Shape();   // Calls Shape constructor

        // Using outer object to create inner object
        Shape.Color obj3 = obj2.new Color();  // Calls Color constructor
    }
}
