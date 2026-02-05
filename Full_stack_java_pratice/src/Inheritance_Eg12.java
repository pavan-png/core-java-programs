// Abstract class
abstract class c1 {

    // Constructor of abstract class
    // ✔ Abstract classes CAN have constructors
    // ✔ Constructor is called when a child object is created
    c1() {
        // This executes FIRST
        System.out.print(1);
    }
}

// c2 extends c1
class c2 extends c1 {

    // Constructor of c2
    c2() {

        // IMPORTANT:
        // super() is IMPLICITLY called here
        // So c1() executes BEFORE this constructor body

        System.out.print(2);
    }
}

// c3 extends c2
class c3 extends c2 {

    // Constructor of c3
    c3() {

        // Again:
        // super() is IMPLICITLY called
        // Which calls c2(), and that again calls c1()

        System.out.print(3);
    }
}

public class Inheritance_Eg12 {

    public static void main(String[] args) {

        // Creating object of c3
        // Constructor call chain happens automatically
        new c3();

        /*
         FLOW OF EXECUTION:

         1️⃣ c3() is requested
         2️⃣ c3() → implicit super() → calls c2()
         3️⃣ c2() → implicit super() → calls c1()
         4️⃣ c1() prints 1
         5️⃣ control returns to c2(), prints 2
         6️⃣ control returns to c3(), prints 3

         FINAL OUTPUT:
         123
        */
    }
}
