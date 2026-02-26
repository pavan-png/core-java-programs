public class Exceptional_Handling_Eg27 {

    // Step 1:
    // Static reference variable of wrapper class.
    // Default value of all reference types (including wrapper classes) is null.
    static Double d1;   // d1 = null

    /*
     Step 2:
     Static variables are initialized in the order they appear.

     Here:
         d1 is null.

     Now we are calling:
         d1.intValue()

     Since d1 is null,
     calling a method on null causes NullPointerException.

     This happens during class loading,
     before main() executes.
    */
    static int i = d1.intValue();   // ❌ NullPointerException

    public static void main(String[] args) {

        /*
         Step 5:
         This line will NEVER execute
         because class initialization fails
         before main() starts.
        */
        System.out.println("Hello");
    }
}