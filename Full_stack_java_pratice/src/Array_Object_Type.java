import java.util.*;

// Fan is a normal class (reference type)
class Fan {

    // Instance variables (properties of Fan object)
    int cost;
    String brand_name;
    int no_Of_Wings;

    // Constructor
    // Used to initialize object state at the time of creation
    Fan(int cost, String brand_name, int no_Of_Wings) {
        this.cost = cost;              // assign cost to current object
        this.brand_name = brand_name;  // assign brand name to current object
        this.no_Of_Wings = no_Of_Wings;// assign number of wings
    }
}

public class Array_Object_Type {
    public static void main(String[] args) {

        // Step 1: Declare and create an array of Fan references
        // This creates space for 3 Fan references (NOT objects)
        Fan[] arr = new Fan[3];

        // At this point:
        // arr → [ null , null , null ]

        // Step 2: Create Fan objects and store their references in the array
        // Each 'new Fan(...)' creates an object in heap
        // The reference of that object is stored in the array

        arr[0] = new Fan(10000, "Havells", 4);
        arr[1] = new Fan(15000, "Orient", 4);
        arr[2] = new Fan(20000, "Usha", 4);

        // Now arr contains references to Fan objects
        // arr → [ Fan@1 , Fan@2 , Fan@3 ]

        // Step 3: Traverse the array using enhanced for-loop
        // Enhanced for-loop is best for read-only access
        // 'f' receives one Fan object reference at a time

        for (Fan f : arr) {

            // Accessing object data using reference variable
            System.out.println("Cost: " + f.cost);
            System.out.println("Brand: " + f.brand_name);
            System.out.println("Wings: " + f.no_Of_Wings);

            // Separator for better output readability
            System.out.println("-----------------------------------------------------");
        }
    }
}
