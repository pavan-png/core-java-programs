import java.util.Scanner;

public class Reverse_The_String_Eg47 {
    public static void main(String[] args) {

        // Create Scanner object to read input
        Scanner sc = new Scanner(System.in);

        // Ask user to enter a string
        System.out.println("Enter the String to reverse");

        // Read the input string
        String s1 = sc.nextLine();

        // String to store the reversed result
        String s2 = "";

        // Loop from last character to first character
        for (int i = s1.length() - 1; i >= 0; i--) {
            // Append each character to s2
            s2 = s2 + s1.charAt(i);
        }

        // Print the reversed string
        System.out.println(s2);
    }
}
