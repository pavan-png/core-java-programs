class Plane {
    public void fly(){
        System.out.println("the plane is flying");
    }
    public void landing(){
        System.out.println("the pane is landing");
    }
    public void takeOff(){
        System.out.println("the plane is taking off");
    }
}
class CargoPlane extends Plane{
    public void fly(){
        System.out.println("cargo plane fly at low height");
    }
    public void carryGoods(){
        System.out.println("cargo plane carries goods");
    }
}
class Passenger_Plane extends Plane{
    public void fly(){
        System.out.println("passenger plane fly at high altitude");
    }
    public void carrPassenger(){
        System.out.println("passenger plane carries passengers");
    }
}
public class Inheritance_Method_Types {
    public static void main(String[] args) {
        CargoPlane obj = new CargoPlane();
        obj.fly();            // overridden method
        obj.landing();         // inherited method
        obj.takeOff();          // inherited method
        obj.carryGoods();        // specialized method
        System.out.println("---------------------------------------------------------");
        Passenger_Plane obj1 = new Passenger_Plane();
        obj1.fly();                // overridden method
        obj1.landing();             // inherited method
        obj1.takeOff();              // inherited method
        obj1.carrPassenger();         // specialed method
    }
}
