// Rule 1: Declare the class as final
// So no other class can extend it and modify behavior
final class Employee_98 {

    // Rule 2: Make all fields private
    // So direct access from outside is not allowed
    private final String pancardNumber;

    // Rule 3: Initialize all fields through constructor
    // Rule 4: Make fields final so they can be assigned only once
    public Employee_98(String pancardNumber) {

        // Optional safety validation
        if (pancardNumber == null || pancardNumber.isEmpty()) {
            throw new IllegalArgumentException("Pancard number cannot be null or empty");
        }

        this.pancardNumber = pancardNumber;
    }

    // Rule 5: Do not provide setter methods
    // Only provide getter method

    public String getPancardNumber() {

        // No defensive copy needed here
        // Because String is immutable
        return pancardNumber;
    }
}


// Main class to test immutability
public class User_Defined_Immutable_Class {

    public static void main(String ar[]) {

        Employee_98 e = new Employee_98("ABC123");

        // Getting pancard number
        String s1 = e.getPancardNumber();

        System.out.println("Pancard Number: " + s1);

        // Attempting to modify string
        s1 = "XYZ999";

        // Original object value remains unchanged
        System.out.println("Pancard Number After Attempted Change: "
                + e.getPancardNumber());
    }
}
