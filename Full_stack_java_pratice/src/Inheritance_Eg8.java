// Component is the parent class
class Component {

    // Instance method
    void go() {
        // If this method is executed, it prints "c"
        System.out.print("c");
    }
}

// Meter is a child of Component
class Meter extends Component {

    // Overridden method
    void go() {
        // This method overrides Component.go()
        // If this method is executed, it prints "m"
        System.out.print("m");
    }
}

// Thingy class HAS-A Meter object
class Thingy {

    // Instance variable 'm'
    // Reference type : Meter
    // Object type    : Meter
    Meter m = new Meter();
}

// Inheritance_Eg8 is a child of Thingy
public class Inheritance_Eg8 extends Thingy {

    public static void main(String[] args) {

        // STEP 1:
        // Creating an object of Inheritance_Eg8
        // This object inherits 'm' from Thingy
        // 'm' is already initialized as new Meter()
        Inheritance_Eg8 dt = new Inheritance_Eg8();

        // STEP 2:
        // Accessing m using child reference (dt)
        // dt.m refers to Meter object
        // go() is an overridden method
        // JVM decides method call at runtime
        // Runtime object is Meter
        dt.m.go();      // prints "m"


        // STEP 3:
        // Upcasting: parent reference pointing to child object
        // Reference type : Thingy
        // Object type    : Inheritance_Eg8
        Thingy t = new Inheritance_Eg8();

        // STEP 4:
        // Accessing m using parent reference (t)
        // Variable 'm' belongs to Thingy, so it is accessible
        // t.m still refers to the same Meter object
        // Method call is resolved at runtime
        // Runtime object is Meter
        t.m.go();       // prints "m"
    }
}
