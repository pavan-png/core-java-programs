public class Exceptional_Handling_Eg28 {

    // Step 1:
    // Static reference variable.
    // Default value of wrapper class is null.
    static Double d1;   // d1 = null

    /*
     Step 2:
     This is an INSTANCE variable.
     Instance variables get initialized
     only when an object is created.

     Here we are calling:
         d1.intValue()

     Since d1 is null, this would normally
     cause NullPointerException.

     BUT this code runs ONLY when an object
     of this class is created.

     In this program, we never create an object.
     So this line never executes.
    */
    int i = d1.intValue();   // No problem (no object created)

    public static void main(String[] args) {

        /*
         Step 3:
         JVM loads the class.
         Static variables are initialized (d1 = null).

         Instance variables are NOT initialized yet
         because no object is created.

         So no NullPointerException occurs.
        */

        System.out.println("Hello");   // Step 4: Executes normally
    }
}