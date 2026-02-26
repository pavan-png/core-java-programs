public class Exceptional_Handling_Try_Catch {
    public static void main(String[] args) {

        System.out.println("connection established");

        try {
            // --- risky code ---
            // We hardcode the values to force the error automatically
            int a = 10;
            int b = 0;

            System.out.println("Numerator is : " + a);
            System.out.println("Denominator is : " + b);

            // This specific line is highly risky because we are dividing by 0.
            // The program will throw an ArithmeticException right here.
            int result = a / b;

            // Because the line above threw an error, the program JUMPS out of
            // the try block. This next line will NEVER execute.
            System.out.println("the result is : " + result);
        }
        catch (ArithmeticException e) {
            // --- handling code ---
            // The program lands here immediately after the error happens.
            System.out.println("Error Handled: dividing by zero is illegal");
        }

        // Because we handled the exception, the program did not crash!
        // It continues to run normally and executes this final line.
        System.out.println("connection terminated normally");
    }
}