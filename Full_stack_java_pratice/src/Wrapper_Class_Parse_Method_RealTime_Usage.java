public class Wrapper_Class_Parse_Method_RealTime_Usage {

    public static void main(String[] args) {

        // 🔷 Step 1: Command line arguments are always String type.
        // Even if user enters numbers, JVM stores them as String.

        // Example while running program:
        // java Wrapper_Class_Parse_Method_RealTime_Usage 10 20

        System.out.println("Command line arguments (String type):");

        System.out.println("args[0] = " + args[0]);
        System.out.println("args[1] = " + args[1]);


        // 🔷 Without using parse method
        // Since both are String, + operator performs concatenation
        System.out.println("Before applying parse method (String concatenation):");
        System.out.println(args[0] + args[1]);   // Output: 1020


        // 🔷 After using parse method
        // Now converting String to primitive int
        int i1 = Integer.parseInt(args[0]);
        int i2 = Integer.parseInt(args[1]);

        System.out.println("After applying parse method (Numeric addition):");
        System.out.println(i1 + i2);   // Output: 30


        // 🔷 Important Concept
        // If we mix String with numbers, Java performs concatenation from left to right

        System.out.println("Mixing String and numbers:");
        System.out.println("Result: " + i1 + i2);
        // Output: Result: 1020
        // Because once String appears, remaining values are treated as String

        System.out.println("Correct numeric result: " + (i1 + i2));
        // Using brackets forces addition first
    }
}