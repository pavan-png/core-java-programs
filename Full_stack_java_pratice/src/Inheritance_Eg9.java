// Parent class
class X {

    X() {
        // Step 3:
        // This constructor is called from X(int x) using this()
        System.out.println(1);
    }

    X(int x) {
        // Step 2:
        // Calls the NO-ARG constructor of the SAME class (X)
        this();          // X()
        System.out.println(2);
    }
}

// Child class
public class Inheritance_Eg9 extends X {

    Inheritance_Eg9() {
        // Step 1:
        // Calls the parent class constructor X(int x)
        super(6);

        // Step 5:
        // Executes after parent constructor chain is complete
        System.out.println(3);
    }

    Inheritance_Eg9(int y) {
        // Step 0:
        // Calls the NO-ARG constructor of the SAME class (Inheritance_Eg9)
        this();

        // Step 6:
        // Executes after Inheritance_Eg9() finishes
        System.out.println(4);
    }

    public static void main(String[] args) {

        // Object creation starts here
        // new Inheritance_Eg9(5) triggers constructor chaining
        new Inheritance_Eg9(5);

        /*
         COMPLETE EXECUTION FLOW:

         Step 0: Inheritance_Eg9(int y) is called
                 |
                 v
         Step 1: this() → Inheritance_Eg9()
                 |
                 v
         Step 2: super(6) → X(int x)
                 |
                 v
         Step 3: this() → X()
                 |
                 v
         Prints: 1
         Returns to X(int x)
         Prints: 2
         Returns to Inheritance_Eg9()
         Prints: 3
         Returns to Inheritance_Eg9(int y)
         Prints: 4

         FINAL OUTPUT:
         1
         2
         3
         4
        */
    }
}
