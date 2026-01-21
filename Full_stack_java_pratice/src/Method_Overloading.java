public class Method_Overloading {

    // Adds two integer values
    // Exact match for two int arguments
    int add(int a, int b) {
        return a + b;
    }

    // Adds three integer values
    // Overloaded method: different number of parameters
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Adds one int and one float
    // Result is promoted to float due to implicit widening (int → float)
    // Return type must be float to hold the widened result
    float add(int a, float b) {
        return a + b;
    }

    // Adds two float values
    // Exact match for two float arguments
    float add(float a, float b) {
        return a + b;
    }

    // Adds three float values
    // Overloaded based on number of parameters
    float add(float a, float b, float c) {
        return a + b + c;
    }

    // Adds int, float, and long
    // int → float, long → float (implicit widening)
    // Final result is float
    float add(int a, float b, long c) {
        return a + b + c;
    }

    // Adds int, float, and double
    // int → double, float → double (implicit widening)
    // Highest data type involved is double, so return type is double
    double add(int a, float b, double c) {
        return a + b + c;
    }

    public static void main(String[] args) {

        int a = 30;
        int b = 40;
        int c = 30;

        float m = 30.3f;
        float n = 10.3f;
        float o = 5.33f;

        double x = 20.34;
        double y = 2.34;
        double z = 5.96;

        // Object creation
        Method_Overloading obj = new Method_Overloading();

        // Method resolution happens at compile time
        // Compiler selects add(int, float, double)
        System.out.println(obj.add(a, n, z));

        // Compiler selects add(int, float)
        System.out.println(obj.add(a, m));
    }
}
