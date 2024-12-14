class CarOil {
    public void FillOil() {
        System.out.println("The fuel is full in the car");
    }
    public void EmptyOil() {
        System.out.println("The car has low oil");
    }
}

class Car_3 {
    private String colour;
    private int maxi_Speed;
    public void carDetails(){
        System.out.println("Car Colour= "+colour + ", Maximum Speed= " + maxi_Speed);
    }
    //Setting colour of the car
    public void setColour(String colour) {
        this.colour = colour;
    }
    //Setting maximum car Speed
    public void setMaxiSpeed(int maxi_Speed) {
        this.maxi_Speed = maxi_Speed;
    }
}

class Ninja extends Car_3 {
    public void NinjaOil() {
        CarOil Ninja_Oil = new CarOil(); //composition
        Ninja_Oil.FillOil();
    }
}

public class CompositionExample_2 {
    public static void main(String[] args) {
        Ninja NinjaCar = new Ninja();
        NinjaCar.setColour("Orange");
        NinjaCar.setMaxiSpeed(180);
        NinjaCar.carDetails();
        NinjaCar.NinjaOil();
    }
}