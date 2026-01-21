public class Method_With_Return_Type_And_Parameters {

    // Instance variable (field)
    // Each object of this class has its own copy of 'c'
    int c;

    // Instance method with return type and parameters
    // This method takes two integer parameters and returns their sum
    int add(int a, int b) {   // parameters
        c = a + b;           // result stored in instance variable
        return c;            // return the calculated value
    }

    public static void main(String[] args) {

        // Creating an object of the class
        Method_With_Return_Type_And_Parameters obj =
                new Method_With_Return_Type_And_Parameters();

        // Calling the add() method with arguments
        // The returned value is stored in the variable 'result'
        int result = obj.add(10, 20);   // arguments

        // Printing the returned result
        System.out.println(result);

        // Note:
        // If a method returns a value, collecting it is optional
        // obj.add(10, 20);  // return value ignored (also valid)
    }
}
