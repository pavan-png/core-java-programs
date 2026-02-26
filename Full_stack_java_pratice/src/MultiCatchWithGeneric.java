import java.util.Scanner;

public class MultiCatchWithGeneric {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter a number: ");
            int number = Integer.parseInt(sc.nextLine());
            // May throw NumberFormatException

            int result = 100 / number;
            // May throw ArithmeticException (if number = 0)

            String str = null;
            System.out.println(str.length());
            // May throw NullPointerException

            System.out.println("Result: " + result);
        }

        // Multi-catch block
        // Instead of writing separate catch blocks for
        // NumberFormatException and ArithmeticException,
        // we combine them using "|" because handling logic is same.
        catch (NumberFormatException | ArithmeticException e) {
            System.out.println("Invalid number or division by zero.");
            System.out.println("Exception type: " + e.getClass().getSimpleName());
        }

        // Generic catch block
        // This handles any other unexpected exception
        // that is not covered in the above multi-catch.
        catch (Exception e) {
            System.out.println("Unexpected error occurred.");
            System.out.println("Exception type: " + e.getClass().getSimpleName());
        }

    }
}