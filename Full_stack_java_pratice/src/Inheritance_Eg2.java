// The top-level parent class in this hierarchy.
class Atom {
    // 5. The Atom constructor is called by the Rock constructor.
    public Atom() {
        // 6. "atom" is printed to the console.
        System.out.println("atom");
    }
}

// The middle class, which inherits from Atom.
class Rock extends Atom {
    // 4. The Rock constructor is called by the Inheritance_Eg2 constructor.
    //    An implicit 'super()' call is made to the Atom constructor first.
    public Rock(String type) {
        // 7. After the Atom constructor finishes, this line is executed.
        //    "granite" is printed to the console.
        System.out.println(type);
    }
}

// The main class, which inherits from Rock.
public class Inheritance_Eg2 extends Rock {
    // 2. The Inheritance_Eg2 constructor is called.
    public Inheritance_Eg2() {
        // 3. 'super("granite")' explicitly calls the constructor of the parent class, Rock.
        super("granite");
        
        // 8. After the first constructor chain completes, a new Rock object is created.
        //    This starts a new, separate constructor chain:
        //    a. Rock("granite") constructor is called.
        //    b. Rock's implicit super() calls the Atom() constructor.
        //    c. "atom" is printed.
        //    d. Control returns to Rock constructor, and "granite" is printed.
        new Rock("granite");
    }

    public static void main(String[] args) {
        // --- Execution Flow ---
        // 1. The main method starts, and a new Inheritance_Eg2 object is created.
        //    This triggers the constructor of Inheritance_Eg2.
        new Inheritance_Eg2();
    }
}

