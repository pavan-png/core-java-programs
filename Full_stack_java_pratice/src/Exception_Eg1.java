import java.util.*;

public class Exception_Eg1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the 1st number");
        int a = sc.nextInt();

        // We no longer ask for the 2nd number from the user.
        // System.out.println("enter the 2nd number");
        // int b = sc.nextInt();

        // EXPLANATION:
        // We intentionally hardcode the value of 'b' to 0.
        // In Java, dividing an integer by zero is mathematically undefined
        // and is not permitted by the JVM.
        int b = 0;

        System.out.println("Attempting to divide " + a + " by " + b + "...");

        // EXPLANATION:
        // When the program reaches this line, it will attempt to calculate a / 0.
        // This will instantly crash the program and throw an:
        // java.lang.ArithmeticException: / by zero
        int c = a / b;

        // This line will never be reached because the program terminates
        // as soon as the exception occurs on the line above.
        System.out.println(c);

        sc.close();
    }
}