// The top-level abstract class in the hierarchy.
abstract class Vechile{
    // A default implementation of the speed() method.
    public int speed(){
        return 0;
    }
}

// The middle class, which inherits from Vechile.
class Car_1 extends Vechile{
    // This method overrides the parent's (Vechile) speed() method.
    @Override
    public int speed(){
        return 60;
    }
}

// The main class, which inherits from Car_1.
public class Inheritance_Eg3 extends  Car_1{
    // This method overrides the parent's (Car_1) speed() method.
    @Override
    public int speed(){
        return 150;
    }

    public static void main(String[] args) {
        // --- Execution Flow & Polymorphism ---

        // 1. A new 'Inheritance_Eg3' object is created and assigned to a reference of the same type.
        Inheritance_Eg3 obj = new Inheritance_Eg3();

        // 2. A new 'Inheritance_Eg3' object is created and assigned to a 'Car_1' (parent) reference.
        //    This is an example of UPCASTING, where a child object is cast to a parent type.
        Car_1 obj1 = new Inheritance_Eg3();

        // 3. A new 'Inheritance_Eg3' object is created and assigned to a 'Vechile' (grandparent) reference.
        //    This is also UPCASTING. Using the abstract class reference promotes LOOSE COUPLING,
        //    as the code can work with any object that 'is-a' Vechile, not just a specific subclass.
        Vechile obj2 = new Inheritance_Eg3();

        // --- Method Resolution (Dynamic Method Dispatch) ---
        // In all three cases above, the actual object created in memory is of type 'Inheritance_Eg3'.
        // Java determines which method to call at RUNTIME based on the object's actual type, not the reference type.
        // Therefore, the 'speed()' method from the 'Inheritance_Eg3' class is called every time.

        // 4. obj.speed() calls the method on the Inheritance_Eg3 object -> returns 150.
        // 5. obj1.speed() calls the method on the Inheritance_Eg3 object -> returns 150.
        // 6. obj2.speed() calls the method on the Inheritance_Eg3 object -> returns 150.
        System.out.println(obj.speed() + " "+ obj1.speed() + " " + obj2.speed());
    }
}

/*
 * --- Final Console Output ---
 * 150 150 150
 */