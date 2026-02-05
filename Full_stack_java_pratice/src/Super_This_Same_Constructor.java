// Parent class
class Vehicle {
    int x;

    // 3. The default Vehicle constructor is called by super() from Car_5.
    Vehicle() {
        // 4. It immediately calls another constructor in the SAME class (Vehicle) using this().
        this(10);
    }

    // 5. The Vehicle(int x) constructor is called with the value 10.
    Vehicle(int x) {
        // 6. The instance variable 'x' is initialized to 10. This constructor finishes.
        this.x = x;
    }
}

// Child class inheriting from Vehicle
class Car_5 extends Vehicle {
    int y;

    // 2. The default Car_5 constructor is invoked.
    Car_5() {
        // 2a. The first thing it does is call the parent's (Vehicle) default constructor.
        super();
        // NOTE: You cannot have both super() and this() in the same constructor.
        // If uncommented, the line below would cause a compile-time error.
        // this(20);

        // 7. After the parent constructor chain is complete, control returns here.
        // The instance variable 'y' is implicitly initialized to its default value of 0.
    }

    // This constructor is defined but never called in this execution flow.
    Car_5(int y) {
        this.y = y;
    }

    // 9. The toString() method of the actual object (Car_5) is called.
    @Override
    public String toString() {
        // 10. It accesses 'x' from the parent (super.x) and 'y' from the current object (this.y).
        // It returns the string "10 0".
        return super.x + " " + this.y;
    }
}

public class Super_This_Same_Constructor {
    public static void main(String[] args) {
        // --- Execution Flow ---
        // 1. A new Car_5 object is created, and its reference is stored in a Vehicle variable.
        //    This triggers the constructor chain.
        Vehicle y = new Car_5();

        // 8. System.out.println() is called on the object. This automatically invokes the object's toString() method.
        //    Due to polymorphism, the toString() method from the Car_5 class is executed.
        System.out.println(y);
    }
}

