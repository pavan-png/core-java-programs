// Parent class
class Super_Calc {

    // Static method
    // Static methods belong to the CLASS, not to objects
    // 'protected' allows access in child classes
    protected static int multiply(int a, int b) {
        return a * b;
    }
}

// Child class
public class Inheritance_Eg6 extends Super_Calc {

    /*
    // This method is COMMENTED OUT
    public static int multiply(int a, int b) {

        IMPORTANT POINT:
        - Static methods do NOT participate in method overriding
        - This is NOT overriding, this is METHOD HIDING

        WHY super.multiply(a, b) DOES NOT WORK HERE?
        ------------------------------------------------
        - 'super' is used to refer to PARENT CLASS MEMBERS
          in the context of an OBJECT (inheritance chain)
        - Static methods do NOT belong to objects
        - Static methods belong to the CLASS itself
        - Therefore, 'super' CANNOT be used inside a static method

        This line causes COMPILE-TIME ERROR:
        int c = super.multiply(a, b);

        Correct way (if needed) would be:
        int c = Super_Calc.multiply(a, b);

        return 10;
    }
    */

    public static void main(String[] args) {

        // Creating child class object
        Inheritance_Eg6 obj = new Inheritance_Eg6();

        // Calling static method using object reference
        // This is allowed, but NOT recommended
        // Compiler resolves this call using the REFERENCE TYPE
        System.out.println(obj.multiply(3, 4));

        // Calling static method using class name (BEST PRACTICE)
        // Since multiply() is not hidden in child,
        // this call resolves to the parent class method
        System.out.println(Inheritance_Eg6.multiply(2, 2));
    }
}
