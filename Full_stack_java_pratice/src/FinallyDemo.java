public class FinallyDemo {

    public static void main(String[] args) {

        try {
            System.out.println("Inside try block");

            int result = 10 / 0;   // Risky code (ArithmeticException)

            System.out.println("This line will not execute");
        }

        catch (Exception e) {
            System.out.println("Exception handled: " + e);
        }

        finally {
            // finally block executes whether exception occurs or not
            System.out.println("Cleanup code in finally block.");
        }

        System.out.println("Program continues after try-catch-finally.");
    }
}