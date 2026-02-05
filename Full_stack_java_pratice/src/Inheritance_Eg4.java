// Parent class
class Building {
    // Parent class with no members
}

// Child class that extends Building (IS-A relationship)
public class Inheritance_Eg4 extends Building {

    public static void main(String[] args) {

        // -------------------------------
        // OBJECT CREATION
        // -------------------------------

        // Creating a parent object
        // Reference type: Building
        // Object type   : Building
        Building obj = new Building();

        // Creating a child object
        // Reference type: Inheritance_Eg4
        // Object type   : Inheritance_Eg4
        Inheritance_Eg4 obj1 = new Inheritance_Eg4();


        // -------------------------------
        // TYPE CASTING EXAMPLES
        // -------------------------------

        // 1. DOWNCASTING (Parent → Child)
        // --------------------------------
        // This causes a RUNTIME ERROR (ClassCastException).
        // Reason:
        // - The runtime object is Building (parent)
        // - We are trying to treat it as Inheritance_Eg4 (child)
        //
        // IMPORTANT RULE:
        // Downcasting is safe ONLY if the object was originally created as the child.
        // For that to happen, upcasting must have happened earlier
        // (i.e., child object referenced by parent reference).
        //
        // Since 'obj' was created as a Building object,
        // downcasting is NOT safe here.
        //
        // Inheritance_Eg4 obj2 = (Inheritance_Eg4) obj; // ❌ Runtime error


        // 2. UPCASTING (Building → Object)
        // --------------------------------
        // Every class in Java is a child of Object.
        // So converting Building to Object is UPCASTING.
        //
        // Upcasting is always SAFE and usually IMPLICIT.
        // The explicit cast (Object) is not required.
        // Writing: Object obj3 = obj; is enough.
        Object obj3 = (Object) obj;


        // 3. INVALID CAST (No IS-A relationship)
        // --------------------------------------
        // Building and String have NO inheritance relationship.
        // Casting between unrelated classes is NOT allowed.
        //
        // This results in a COMPILE-TIME ERROR.
        //
        // String str1 = (String) obj; // ❌ Compile-time error


        // 4. UPCASTING (Child → Parent)
        // -----------------------------
        // A child object is being assigned to a parent reference.
        // Runtime object : Inheritance_Eg4 (child)
        // Reference type : Building (parent)
        //
        // This is the SAFE and STANDARD form of upcasting.
        // The explicit cast (Building) is not needed.
        // Preferred form: Building obj4 = obj1;
        Building obj4 = (Building) obj1;


        // -------------------------------
        // PROGRAM END
        // -------------------------------
        System.out.println("Type casting examples demonstrated.");
        System.out.println("Unsafe downcasting is commented to avoid runtime error.");
    }
}
