// Abstract class
abstract class Acccess_modifiers {

    // Abstract method
    // • Has NO body
    // • Must be implemented by the child class
    // • Protected means: accessible to child classes
    protected abstract double getSales();

    // Concrete (normal) method
    // • This method has a body
    // • It calls getSales()
    // • At runtime, the CHILD class version of getSales() is executed
    public double getCommision() {
        // Commission is 15% of sales
        return getSales() * 0.15;
    }
}

// Child class
public class Inheritance_Eg10 extends Acccess_modifiers {

    // Overriding the abstract method from parent class
    // RULE:
    // • Access level CANNOT be reduced
    // • protected → public is allowed
    // • protected → default/private is NOT allowed

    @Override
    public double getSales() {
        // Providing actual implementation for abstract method
        return 1230.45;
    }

    public static void main(String[] args) {

        // Creating object of child class
        Inheritance_Eg10 obj = new Inheritance_Eg10();

        // Calling getSales()
        // This directly executes child class method
        obj.getSales();

        // If we call getCommision():
        // 1️⃣ getCommision() is in parent class
        // 2️⃣ Inside getCommision(), getSales() is called
        // 3️⃣ Child class getSales() executes (runtime polymorphism)
        // 4️⃣ Commission = 1230.45 * 0.15
        double commission = obj.getCommision();

        // Printing the commission
        System.out.println(commission);
    }
}
