class Payload { // Encapsulated class

    // Instance variable (object-specific data)
    private int weight;

    // Constructor initializes the instance variable
    public Payload(int w) {
        weight = w;
    }

    // Setter method to modify instance variable
    public void setWeight(int w) {
        weight = w;
    }

    /*
     toString() is overridden.
     Whenever an object is printed, this method is called automatically.
     Here it behaves like a getter by returning weight as String.
    */
    public String toString() {
        return Integer.toString(weight);
    }
}

public class Static_Method_Eg2 {

    /*
     Static method:
     - Belongs to the class, not to any object
     - Can receive object references as parameters
     - Using the reference, it can access instance methods
    */
    static void changePayload(Payload p) {

        /*
         p is a local variable that holds a COPY of the reference
         Both 'p' and the caller variable refer to the SAME object

         Calling instance method using reference is allowed
         Object state will be modified
        */
        p.setWeight(420);
    }

    public static void main(String[] args) {

        // Step 1: Object creation
        // weight = 200
        Payload p = new Payload(200);

        // Step 2: Modify object state using instance method
        // weight = 1024
        p.setWeight(1024);

        /*
         Step 3: Pass object reference to static method
         - A copy of the reference is passed
         - Object itself is NOT copied
        */
        changePayload(p);

        /*
         Step 4: Printing object
         - toString() is called automatically
         - Shows updated object state
        */
        System.out.println("p is " + p); // prints: p is 420
    }
}
