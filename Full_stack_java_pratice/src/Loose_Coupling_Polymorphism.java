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
        p.takeOff();
        p.fly();
        p.landing();
    }
}
public class Loose_Coupling_Polymorphism {
    public static void main(String[] args) {
        Cargo_plane ref = new Cargo_plane();
        Passenger_plane1 ref1 = new Passenger_plane1();
        Airport ref2 = new Airport();
        ref2.runway(ref);
        ref2.runway(ref1);

    }
}
