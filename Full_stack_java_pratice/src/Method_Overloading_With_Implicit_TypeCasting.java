public class Method_Overloading_With_Implicit_TypeCasting {

    // Method 1:
    // Parameters: (int, float)
    // int is implicitly widened to float
    // Final expression becomes float
    // Return type is double (float → double widening)
    double add(int a, float b) {
        System.out.println("this is double return type method");
        return a + b;
    }

    // Method 2:
    // Parameters: (float, int)
    // int is implicitly widened to float
    // Final expression becomes float
    // Return type is float
    float add(float a, int b) {
        System.out.println("this is float return type method");
        return a + b;
    }

    public static void main(String[] args) {

        Method_Overloading_With_Implicit_TypeCasting obj =
                new Method_Overloading_With_Implicit_TypeCasting();

        // Method call with arguments (20, 30.3f)
        // Argument types are (int, float)
        // Compiler first looks for an exact match
        // add(int, float) is an exact match, so it is selected
        // No ambiguity occurs
        obj.add(20, 30.3f);
    }
}
