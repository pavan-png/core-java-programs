class Plane1 {
    public void takeOff(){
        System.out.println("plane is  taking off");
    }
    public void fly(){
        System.out.println("plane is flying");
    }
    public  void landing(){
        System.out.println("plane is lading");
    }

    // Compile-time polymorphism (method overloading): same method name, different parameters.
    public void fly(int speed){
        System.out.println("plane is flying at speed " + speed);
    }
}
class Cargo_plane extends Plane1{
    public void takeOff() {
        System.out.println("Cargo plane is heavy in weight ,so takeoff is a bit difficult");
    }
    public void fly() {
        System.out.println("Cargo plane fly at low heights");
    }
    public void landing() {
        System.out.println("Cargo plane needs more distance to stop ");
    }
}
class Passenger_plane1 extends Plane1{
    public void takeOff() {
        System.out.println("Passenger plane takes less time to takeoff when compared to others");
    }
    public void fly() {
        System.out.println("passenger plane  fly at high altitude");
    }
    public void landing(){
        System.out.println("passenger plane stops at less distance");
    }
}

class Airport{
    public  void runway (Plane1 p){
        // Runtime polymorphism (method overriding): actual object decides which method runs.
        p.takeOff();
        p.fly();
        p.landing();
    }

    // Compile-time polymorphism (method overloading): same name, different parameter type.
    public void runway(Cargo_plane p){
        p.takeOff();
        p.fly();
        p.landing();
    }
}
public class Tight_Loose_Up_Downcasting {
    public static void main(String[] args) {
        // Tight coupling: using concrete classes directly makes code harder to change.
        Cargo_plane cargoTight = new Cargo_plane();
        Passenger_plane1 passengerTight = new Passenger_plane1();
        cargoTight.fly();
        passengerTight.fly();

        // Loose coupling: using parent type lets us swap implementations easily.
        Plane1 ref = new Cargo_plane(); // Upcasting: child object referenced by parent type.
        Plane1 ref1 = new Passenger_plane1(); // Upcasting: child object referenced by parent type.
        Airport ref2 = new Airport();
        ref2.runway(ref);
        ref2.runway(ref1);

        // Runtime polymorphism: overridden methods are chosen at runtime based on object type.
        ref.fly();
        ref1.fly();

        // Compile-time polymorphism (overloading): chosen by compiler using arguments.
        ref.fly(600);

        // Downcasting: parent reference cast back to child type (only safe if it is that type).
        if (ref instanceof Cargo_plane) {
            Cargo_plane down = (Cargo_plane) ref;
            down.landing();
        }
    }
}
