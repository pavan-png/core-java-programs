// Engine class
class Engine {
    private String model;

    public Engine(String model) {
        this.model = model;
    }

    public void start() {
        System.out.println("Engine " + model + " is starting.");
    }

    public void stop() {
        System.out.println("Engine " + model + " is stopping.");
    }

    public String getModel() {
        return model;
    }
}

// Car class (has-a Engine)
class Car_2 {
    private String make;
    private String model;
    private Engine engine;  // Composition: Car "has-a" Engine

    public Car_2(String make, String model, String engineModel) {
        this.make = make;
        this.model = model;
        this.engine = new Engine(engineModel); // Engine is created within the Car class
    }

    public void drive() {
        System.out.println("Driving the " + make + " " + model);
        engine.start();
    }

    public void park() {
        System.out.println("Parking the " + make + " " + model);
        engine.stop();
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public Engine getEngine() {
        return engine;
    }
}

// Main class to test the composition
public class CompositionExample {
    public static void main(String[] args) {
        Car_2 car = new Car_2("Toyota", "Camry", "V6");

        System.out.println("Car make: " + car.getMake());
        System.out.println("Car model: " + car.getModel());
        System.out.println("Engine model: " + car.getEngine().getModel());

        // Driving the car
        car.drive();

        // Parking the car
        car.park();
    }
}
