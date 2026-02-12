// Outer class
class Shape_1 {

    // 🔹 Private instance variable
    private boolean isDisplayed;

    // 🔹 Protected instance variable
    protected int canvasId;

    // 🔹 Constructor of outer class
    public Shape_1() {
        isDisplayed = false;
        canvasId = 0;
    }

    // 🔹 Non-static Member Inner Class
    public class Color_1 {

        // Method inside inner class
        public void display() {

            /*
             ✔ Inner class can access all members of outer class
             ✔ Even private and protected instance variables
             ✔ No getter method required
            */

            System.out.println("isDisplayed : " + isDisplayed);
            System.out.println("canvasId : " + canvasId);
        }

        // 🔹 main() method inside inner class
        public static void main(String[] args) {

            /*
             Even though this main() is inside inner class,
             it is static, so it can act as an entry point
             if we run this inner class directly.

             To create inner class object:
             1️⃣ Create outer object
             2️⃣ Use outerObject.new InnerClass()
            */

            Shape_1.Color_1 obj = new Shape_1().new Color_1();
            obj.display();
        }
    }
}

// Separate outer class with main method
public class Inner_Class_Eg3 {

    public static void main(String[] args) {

        /*
         This is the main entry point when we run this file.

         Inner class object creation:
         new Shape_1()  → creates outer object
         .new Color_1() → creates inner object associated with that outer object
        */

        Shape_1.Color_1 obj = new Shape_1().new Color_1();
        obj.display();

        /*
         Important Note:

         ✔ We CAN define main() inside an inner class.
         ✔ But the JVM will execute only the main() of the class
           that we run explicitly.
         ✔ It does NOT automatically search inner classes for main().
        */
    }
}
