import java.util.*;

class Fan {
    int cost;
    String brand_name;
    int no_Of_Wings;

    // Constructor to initialize values quickly
    Fan(int cost, String brand_name, int no_Of_Wings) {
        this.cost = cost;
        this.brand_name = brand_name;
        this.no_Of_Wings = no_Of_Wings;
    }
}

public class Array_Object_Type {
    public static void main(String[] args) {
        // Create array of Fan objects directly with constructor
        Fan[] arr = new Fan[3];

        arr[0] = new Fan(10000, "Havells", 4);
        arr[1] = new Fan(15000, "Orient", 4);
        arr[2] = new Fan(20000, "Usha", 4);

        // Print details using enhanced for-loop (cleaner than traditional for loop)
        for (Fan f : arr) {
            System.out.println("Cost: " + f.cost);
            System.out.println("Brand: " + f.brand_name);
            System.out.println("Wings: " + f.no_Of_Wings);
            System.out.println("-----------------------------------------------------");
        }
    }
}
