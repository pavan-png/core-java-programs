public class Finally_Block_Exit_Method {

    public static void main(String[] args) {

        try {
            System.out.println("Inside try block");

            // Terminating JVM explicitly
            System.exit(0);

            // This line will never execute
            System.out.println("This line will not print");

        } catch (Exception e) {
            System.out.println("Inside catch block");
        } finally {
            // This will NOT execute because JVM already stopped
            System.out.println("Inside finally block");
        }

        // This will also not execute
        System.out.println("End of program");
    }
}