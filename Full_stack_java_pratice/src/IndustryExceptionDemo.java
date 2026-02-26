import java.util.Scanner;

public class IndustryExceptionDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        String input1 = sc.nextLine();

        System.out.print("Enter second number: ");
        String input2 = sc.nextLine();

        try {
            // 1️⃣ Only risky code inside try
            int a = Integer.parseInt(input1);   // May throw NumberFormatException
            int b = Integer.parseInt(input2);   // May throw NumberFormatException

            int result = a / b;                 // May throw ArithmeticException

            System.out.println("Result: " + result);
        }

        // 2️⃣ Specific catch block
        catch (ArithmeticException e) {
            System.out.println("Invalid division operation. Division by zero is not allowed.");

            // 6️⃣ Logging (simulated)
            System.err.println("LOG: ArithmeticException occurred -> " + e.getMessage());
           // Using System.err.println() (in real projects → logger framework)
        }

        // 3️⃣ Another specific catch
        catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter only numeric values.");

            // Logging
            System.err.println("LOG: NumberFormatException occurred -> " + e.getMessage());
        }

        // 4️⃣ Generic catch at last
        catch (Exception e) {
            System.out.println("Unexpected error occurred. Please try again later.");

            // Logging
            System.err.println("LOG: Unexpected Exception -> " + e.getMessage());
        }

        // 7️⃣ Program continues normally
        System.out.println("Program continues...");

        sc.close();
    }
}