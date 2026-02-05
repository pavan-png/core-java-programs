// Interface
interface Fish {
    // Marker interface (no methods)
}

// Perch implements Fish
// So: Perch IS-A Fish
class Perch implements Fish {
}

// Walleye extends Perch
// So: Walleye IS-A Perch
// And since Perch IS-A Fish,
// Walleye IS-A Fish as well (indirectly)
class Walleye extends Perch {
}

public class Bluegill {

    public static void main(String[] args) {

        // Upcasting:
        // Reference type → Fish
        // Runtime object → Walleye
        Fish f = new Walleye();

        // Normal object creation
        Walleye w = new Walleye();

        // Object of unrelated class
        Bluegill b = new Bluegill();

        // instanceof checks the RUNTIME object type

        // f refers to a Walleye object
        // Walleye extends Perch
        // So Walleye IS-A Perch
        if (f instanceof Perch)
            System.out.print("f-p");

        // w is a Walleye object
        // Walleye implements Fish indirectly (through Perch)
        if (w instanceof Fish)
            System.out.print("w-f");

        // b is a Bluegill object
        // Bluegill does NOT implement Fish
        // No IS-A relationship exists
        if (b instanceof Fish)
            System.out.print("b-f"); // this will NOT execute
    }
}
