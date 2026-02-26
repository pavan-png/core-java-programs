class ThrowKeywordExample {

    // This method checks age and throws exception manually
    static void checkAge(int age) {

        System.out.println("Checking age...");

        // If age is less than 18, manually throw exception
        if (age < 18) {

            // Creating and throwing exception object
            throw new ArithmeticException("Age must be 18 or above");

            // ❌ Any code written here will NEVER execute
            // System.out.println("This line will not run");
        }

        // This line executes only if no exception occurs
        System.out.println("Age is valid for voting");
    }

    public static void main(String[] args) {

        try {
            checkAge(15);  // Passing invalid age
            System.out.println("After method call");
            // ❌ This line will NOT execute if exception occurs
        }

        catch (ArithmeticException e) {
            // Handling the thrown exception
            System.out.println("Exception caught in main()");
            System.out.println("Reason: " + e.getMessage());
        }

        finally {
            // Finally block always executes
            System.out.println("Finally block executed");
        }

        System.out.println("Program continues normally");
    }
}