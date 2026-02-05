class Plane {
    public void fly() {
        System.out.println("the plane is flying");
    }
    public void landing() {
        System.out.println("the plane is landing");
    }
    public void takeOff() {
        System.out.println("the plane is taking off");
    }
}

class CargoPlane extends Plane {
    // overridden method
    public void fly() {
        System.out.println("cargo plane flies at low height");
    }

    // specialized method (exists only in child)
    public void carryGoods() {
        System.out.println("cargo plane carries goods");
    }
}

class Passenger_Plane extends Plane {
    // overridden method
    public void fly() {
        System.out.println("passenger plane flies at high altitude");
    }

    // specialized method
    public void carryPassenger() {
        System.out.println("passenger plane carries passengers");
    }
}

public class Inheritance_Method_Types {
    public static void main(String[] args) {

        // -------- Child reference --------
        CargoPlane obj = new CargoPlane();
        obj.fly();          // overridden method
        obj.landing();      // inherited method
        obj.takeOff();      // inherited method
        obj.carryGoods();   // specialized method

        System.out.println("----------------------------------");

        // -------- Parent reference (polymorphism) --------
        Plane ref = new CargoPlane();
        ref.fly();          // overridden method (runtime polymorphism)
        ref.landing();      // inherited method
        ref.takeOff();      // inherited method

        // ref.carryGoods();
        // ❌ Compile-time error
        // Reason: specialized methods are NOT polymorphic
    }
}
