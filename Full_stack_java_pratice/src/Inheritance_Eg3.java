abstract class Vechile{
    public int speed(){
        return 0;
    }
}
class Car_1 extends Vechile{
    public int speed(){
        return 60;
    }
}
public class Inheritance_Eg3 extends  Car_1{
    public int speed(){
        return 150;
    }
    public static void main(String[] args) {
        Inheritance_Eg3 obj = new Inheritance_Eg3();
        Car_1 obj1 = new Inheritance_Eg3(); // parent reference can hold child class object
        Vechile obj2 = new Inheritance_Eg3();  // grandparent can also hold child class object
        // here runtime object is Inheritance_Eg3 in all the above 3 cases, so that object method is executed every time.

        System.out.println(obj.speed() + " "+ obj1.speed() + " " + obj2.speed());

    }
}
